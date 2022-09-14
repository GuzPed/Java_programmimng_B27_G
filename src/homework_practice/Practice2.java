package homework_practice;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter price");
        double a = input.nextDouble();
        System.out.println("Enter the quantity");
        int b = input.nextInt();
        double c = a*b;
        System.out.println("Total revenue is " + c);




    }
}
