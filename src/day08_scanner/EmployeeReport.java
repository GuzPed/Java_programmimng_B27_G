package day08_scanner;

import java.util.Scanner;

public class EmployeeReport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName = input.nextLine();
        System.out.println("Enter your job title");
        String jobTitle = input.nextLine();
        System.out.println("What is your hourly rate");
        Double hourRate = input.nextDouble();
        System.out.println("How many hours you work");
        int hours = input.nextInt();

        Double salary = hourRate * hours*52;

        input.nextLine();
        System.out.println("Where is the Company HQ");
        String address = input.nextLine();

        System.out.println("Are you are full time: true or false");
        boolean a = input.nextBoolean();

        String report = fullName + " is a " + jobTitle + " she/he makes $" + salary + " because they are fulltime " + a + ". the company is located " + address ;
        System.out.println(report);





    }

}
