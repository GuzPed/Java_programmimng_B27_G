package day23_arrays_day2;

import java.util.Arrays;
import java.util.Scanner;

public class PartyList_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("How many people are coming");
        int size = input.nextInt();
        String name = "";

        String[] names = new String[size]; //new String[input.nextInt()]


        for (int i=0; i< names.length;i++){
            System.out.println("Enter the name of the guest " + (i+1)); //in you don't have the parenthesis the line will concatenate , but we want to do addition frist+1, then concatenate the message
            names[i] = input.next();

            //String guest = input.next();
           // names[i] = guest;


        }
        System.out.println("Final List coming to the party ");
        System.out.println(Arrays.toString(names));



    }
}
