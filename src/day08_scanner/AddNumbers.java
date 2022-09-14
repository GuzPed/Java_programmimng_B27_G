package day08_scanner;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number");
        int a = input.nextInt();
        System.out.println("Please enter second number");
        int b = input.nextInt();
        int c = a+b; //input.nextInt()+input.nextInt() - we can use it, it won't be able to reuse it. so we need to declare variable

        System.out.println("Total is" + c);

    }


}
