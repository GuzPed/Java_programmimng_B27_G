package day07_scanner;
import java.util.Scanner;

public class PracticeScanner2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter the price ");
        double a = input.nextDouble();
        System.out.println("Please enter the quantity ");
        int b = input.nextInt();

        double revenue = a*b;
        System.out.println("the revenue is " + revenue);




    }


}
