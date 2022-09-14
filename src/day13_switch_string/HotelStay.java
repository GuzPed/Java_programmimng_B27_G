package day13_switch_string;

import java.util.Scanner;

public class HotelStay {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Welcome to the Java Hotel! \nHow many days will you  be staying");
        int days = input.nextInt();
        System.out.println("How many people do you have in the party?");
        int party = input.nextInt();
        String room;
        double price;

        switch (party){
            case 1:
                room = "single room";
                price = days * 100;
                break;
            case 2:
                room = "double room";
                price = days*125;
                break;
            case 3:
            case 4:
                room = "large room";
                price = days* party * 150;
                break;
            case 5:
            case 6:
            case 7:
                room = "suite";
                price = days* 5000;
                break;
            default:
                room = "no rooms available";
                price = -1;
                break;


        }
        System.out.println("days = " + days);
        System.out.println("party = " + party);
        System.out.println("room = " + room);
        System.out.println("price = " + price);




    }
}
