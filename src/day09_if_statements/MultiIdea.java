package day09_if_statements;

import java.util.Scanner;

public class MultiIdea {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("what is number of the month today");
                int month = input.nextInt();
        if (month == 1) {
            System.out.println("it is january");
        } else if (month==2) {
            System.out.println( "It is february");
        } else if (month == 3) {
            System.out.println(" It is march");
        } else if (month == 4) {
            System.out.println(" It is april");  }
        else if (month == 5) {
            System.out.println(" It is may");  }
        else if (month == 6) {
            System.out.println(" It is june");  }
        else if (month == 7) {
            System.out.println(" It is july");  }
        else if (month == 8) {
            System.out.println(" It is august");  }
        else if (month == 9) {
            System.out.println(" It is september");  }
        else if (month == 10) {
            System.out.println(" It is october");  }
        else if (month == 12) {
            System.out.println(" It is december");  }
        else {
            System.out.println("It is december");
        }

    }
}
