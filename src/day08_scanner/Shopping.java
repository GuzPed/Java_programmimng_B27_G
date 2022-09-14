package day08_scanner;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the item name");
        //String item = "Ball";
        String item = input.next();
        System.out.println("What is the price");
        //double price = 5.99;
        double price = input.nextDouble();
        System.out.println("How namy " + item + "/s do you want?");
        //int quantity = 3;
        int quantity = input.nextInt();

        String report = "Your total for " + quantity + " " + item + "/s is " + quantity*price;
        System.out.println(report);




    }


}
