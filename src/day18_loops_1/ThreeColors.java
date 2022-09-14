package day18_loops_1;

import java.util.Scanner;

public class ThreeColors {
    /*
        write a program that will allow the user to select three colors for the painting. There needs to be 3 unique colors selected
         */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfColors = 1;
        String chosenColor = " ";

        do {
            System.out.println("Enter your color");
            String color = input.next();

            if (chosenColor.contains(color)) {
                System.out.println("Sorry, must be unique color. try again");
                numOfColors--;
            } else {
                chosenColor += color + " ";
            }
    } while (numOfColors++<3);

        System.out.println("nice job.\n" + chosenColor);

}}
