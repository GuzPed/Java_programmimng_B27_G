package day08_scanner;

import java.util.Scanner;

public class Angles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 number");
        float a= input.nextFloat();
        float b= input.nextFloat();
        float c= input.nextFloat();
        float sum = a+b+c;

        boolean isTriagle = sum==180.00;
        boolean isCircle = sum==360.00;
        System.out.println("isTriagle = " + isTriagle);
        System.out.println("isCircle = " + isCircle);




    }


}
