import java.sql.*;


public class JDBC {
    private static Connection connection = null;
    private static PreparedStatement statement = null;
    private static String url = "jdbc:mysql://localhost:3306/CarService";
    private static String user = "root";
    private static String password = "1401";
    private static int count;

    public static void main(String[] args) throws SQLException {

        try {
            AddCar("BMW", "Black", 3.2, 15.500);
            AddCar("MercedesBenz", "White", 4.3, 12.600);
            AddCar("Toyota", "Red", 3.5, 10.700);

            SelectCar();

            UpdateCar(2, "Lexus");

            SelectCar();

            DeleteCar(2);

            SelectCar();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }


    private static void ConnectionDb(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
                //System.out.println("Connection to Store DB succesfull!");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    private static void AddCar(String Model, String Color, double EngineVolume, double Prise) throws SQLException {
        try {
            ConnectionDb();

            statement = connection.prepareStatement("insert into car(Model, Color, EngineVolume, Prise) values (?,?,?,?)");
            statement.setString(1,Model);
            statement.setString(2,Color);
            statement.setDouble(3,EngineVolume);
            statement.setDouble(4,Prise);
            count = statement.executeUpdate();
            System.out.println(count);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (statement != null){
                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (connection != null){
                    connection.close();
                }
            }catch (SQLException e){
                e.printStackTrace();
            }
        }


    }

    private static void SelectCar(){
        try {
            ConnectionDb();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select* from car");
            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String Model = resultSet.getString(2);
                String Color = resultSet.getString(3);
                double EngineVolume = resultSet.getDouble(4);
                double Prise = resultSet.getDouble(5);
                System.out.printf("%d %s %s %f %f \n", id, Model, Color, EngineVolume, Prise);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally {
            try {
                if (statement != null){
                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (connection != null){
                    connection.close();
                }
            }catch (SQLException e){
                e.printStackTrace();
            }
        }

    }

    private static void UpdateCar(int CarId, String Model){
        try {
            ConnectionDb();
            statement = connection.prepareStatement("update car set Model = ? where CarId = ?");
            statement.setString(1,Model);
            statement.setInt(2,CarId);
            count = statement.executeUpdate();
            System.out.printf("%d count updated \n", count);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally {
            try {
                if (statement != null){
                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (connection != null){
                    connection.close();
                }
            }catch (SQLException e){
                e.printStackTrace();
            }
        }

    }

    private static void DeleteCar(int carId){
        try {
            ConnectionDb();
            statement = connection.prepareStatement("delete from car where CarId = ?");
            statement.setInt(1,carId);
            count = statement.executeUpdate();
            System.out.printf("%d count deleted \n", count);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                if (statement != null){
                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (connection != null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}