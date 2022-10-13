package Part1.Pojo;


public class Car {

        private long CarId;
        private String Model;
        private String Color;
        private double EngineVolume;
        private String Prise;


    public Car(){

    }

    public Car(long carId, String model, String color, double engineVolume, String prise) {
        CarId = carId;
        Model = model;
        Color = color;
        EngineVolume = engineVolume;
        Prise = prise;
    }


    public long getCarId() {
        return CarId;
    }

    public void setCarId(long carId) {
        CarId = carId;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public double getEngineVolume() {
        return EngineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        EngineVolume = engineVolume;
    }

    public String getPrise() {
        return Prise;
    }

    public void setPrise(String prise) {
        Prise = prise;
    }
}