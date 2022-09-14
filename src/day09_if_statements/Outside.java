package day09_if_statements;

import java.util.Scanner;

public class Outside {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
                double degrees;
        System.out.println("What is the temperature outside?");
        degrees = input.nextDouble();

        if (degrees>=72) {
            System.out.println("Its nice, go  outside");
        }
        if (degrees < 72){
            System.out.println("stay inside, code some java");
        }


        if (degrees>=72) {
            System.out.println("Its nice, go  outside");
        } else {
            System.out.println("stay inside, code some java");
        }



    }


}
