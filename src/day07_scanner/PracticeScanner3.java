package day07_scanner;
import java.util.Scanner;

public class PracticeScanner3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println(" Please enter the first angle number ");
        float a = input.nextFloat();
        System.out.println("Please enter the second angle number");
        float b = input.nextFloat();
        System.out.println("Please enter the third angle number");
        float c = input.nextFloat();

        boolean isItTriangle = (a+b+c) == 180.0;
        System.out.println("This is a triangle - " + isItTriangle);

        boolean isItCircle = (a+b+c) == 360.0;
        System.out.println(" This is a circle -" + isItCircle);




    }



}
