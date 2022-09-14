package homework_practice;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter your yearly salary");
        double salary = input.nextDouble();
        System.out.println("Please enter hours per week");
        int hours = input.nextInt();

        Double hourlyRate = salary / (hours*52);

        System.out.println("your hour rate is " + hourlyRate);




    }

}
