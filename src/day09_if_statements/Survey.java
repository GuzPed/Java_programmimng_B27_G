package day09_if_statements;

import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("are you are student?");
        boolean isStudent = input.nextBoolean();
        if (isStudent){
            System.out.println("What are you studying? ");
            String subject = input.next();

        }
        System.out.println("Do you live in a city? t/F");
        if (input.nextBoolean()) {
            System.out.println("Cool, cities are loud and fun");
        }
        else {
            System.out.println("How many years have you lived in the suburbs");
            int years = input.nextInt();
            System.out.println("Ooo, cool " + years + " in the suburbs");


        }




    }


}
