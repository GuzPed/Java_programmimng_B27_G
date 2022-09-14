package day15_string_methods_2;

import java.util.Scanner;

public class Title {
    public static void main(String[] args) {
        /*
        create a class Title
ask the user to enter their name including titles
use the following titles to determine how to refer to the person

handle case sensitivity. User could enter a title as ms, or MS, or Ms. All should result in a valid result

	titles:
		Mr or Mister
		Ms or Miss or Madam
		Dr
	and some titles can come after a name:
		Sr
		Jr

Based on both starting and ending titles print the following messages:
		Mr or Mister: Hello Sir
		Ms or Miss or Madam: Hello Ma'am
		Dr: Hello Doctor

		Sr: Nice to meet you Senior
		Jr: Nice to meet you Junior

Note: It is possible to have both beginning and ending titles, one of them, or none of them
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name including your title");
        String nameTitle = input.nextLine().toLowerCase();


        boolean isTitleWoman = nameTitle.contains ("ms") || nameTitle.contains("miss") || nameTitle.contains("madam");
        boolean isTitleMan = nameTitle.contains("mr") || nameTitle.contains("mister");
        boolean isTitleDr = nameTitle.contains("dr");
        boolean isTitleSr = nameTitle.contains("sr");
        boolean isTitleJr = nameTitle.contains("jr");

        if (isTitleWoman) {
            System.out.println("Hello Ma'am");
        } else if (isTitleMan) {
            System.out.println("Hello Sir");
        } else if (isTitleDr) {
            System.out.println("Hello Doctor");
        }

        if (isTitleSr) {
            System.out.println("Nice to meet you Senior");
        } else if (isTitleJr) {
            System.out.println("Nice to meet you Junior");
        }







    }

        }



