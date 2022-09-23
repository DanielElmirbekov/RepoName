import java.util.Scanner;

import static java.lang.System.in;

public class CompareSubstring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);

        System.out.println("Напишите слова: ");

        while (scan.hasNext()) {
            count(scan.nextLine(), scan.nextLine());
        }
    }


    private static void count(String a, String b) {
        int startIndex = 0;
        int endIndex = 1;
        int counter = 0;

        
    }
}