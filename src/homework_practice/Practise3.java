package homework_practice;

import java.util.Scanner;
/*
Create a program that will ask the user to enter 3 angle numbers ( can be floating numbers )
    Determine if the angles make a triangle, which means the angles add to 180.0
    and
    Determine if the angles make a circle, which means the angles add to 360.0
 */
public class Practise3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first angle number");
        int a = input.nextInt();
        System.out.println("Enter second angle number");
        float b = input.nextFloat();
        System.out.println("Enter third angle number");
        float c = input.nextFloat();
        float d = a+b+c;

        boolean isThisTriagle = (a+b+c)==180;
        boolean isThisCircle = (a+b+c)==360;


        System.out.println("isThisTriagle = " + isThisTriagle);
        System.out.println("isThisCircle = " + isThisCircle);





    }


}
