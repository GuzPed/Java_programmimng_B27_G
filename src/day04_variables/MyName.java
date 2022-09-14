package day04_variables;

import org.w3c.dom.ls.LSOutput;

public class MyName {
    /*
    declare your name as multiple char varuiables
    print your name, see what happens
     */

    public static void main(String[] args) {
        char first = 'G', second = 'u', third = 'z', fourth = 'e',fifth = 'l'  ;
        System.out.print(first);
        System.out.print(second);
        System.out.print(third);
        System.out.print(fourth);
        System.out.print(fifth);
        System.out.println();

        System.out.println("My name is " + first + second + third + fourth + fifth);// we concatenate a String in the beginning, this will concatenate all the chars together
        System.out.println(" " + first + second + third + fourth + fifth);

    }




}
