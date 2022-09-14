package day28_methods;

import java.util.Scanner;

public class Numbers {
    public static void checkNum(int n){
        if (n>0) {
            System.out.println("Positive");
        } else if (n<0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }


    }

    public static void main(String[] args) {
        checkNum(51);
        checkNum(0);
        checkNum(-14);

        Scanner input = new Scanner (System.in);
        checkNum(input.nextInt());
    }



}
