package day09_if_statements;

import java.util.Scanner;

public class ThreeVariables {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int biggest = 0;
        if (a>b && a>c) {
         biggest = a   ;
        } else if (b>a && b>c){
          biggest = b  ;
        } else {
            biggest = c ;
        }
        System.out.println(biggest + " is bigger");

    }


}
