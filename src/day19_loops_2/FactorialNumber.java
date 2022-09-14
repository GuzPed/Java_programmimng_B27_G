package day19_loops_2;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {

        int num = new Scanner (System.in).nextInt();
        int factorial = 1;

        for (int i = num; i>1; i--) {
            factorial*=i;

        }

        System.out.println(factorial);


    }


}
