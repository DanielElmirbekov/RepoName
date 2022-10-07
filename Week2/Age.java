import java.util.Scanner;


public class Age {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите свой возраст: ");
        int age =scan.nextInt();
        


        if (age <= 6){
            System.out.println("Мультфильм");
        }else if (age <= 12){
            System.out.println("Познавательные");
        }else if (age <= 16){
            System.out.println("Боевики");
        }else{
            System.out.println("Любовь");
        }
    }

}
