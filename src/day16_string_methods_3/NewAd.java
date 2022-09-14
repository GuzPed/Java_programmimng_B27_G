package day16_string_methods_3;

import java.util.Scanner;

public class NewAd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your address");
        String address = input.nextLine().toUpperCase().trim();

        System.out.println(address);

        if (address.startsWith("500")) {
            System.out.println("house is on the right side");
        } else if (address.startsWith("600")) {
            System.out.println("house is on the left side");
        }
        if (address.contains("DRIVE")) {
            System.out.println("on drive");
        } else if (address.contains("LANE")) {
            System.out.println("on lane");
        } else if (address.contains("AVE")) {
            System.out.println("on ave");
        }



    }
}
