package day26_multi_array;

import java.util.Arrays;
import java.util.Scanner;

public class Homework_4 {
    public static void main(String[] args) {
        /*
        We did the group task together, try to make it completely dynamic with Scanner inputs. Ask the number of groups, the number of people in group1, group2, group3, etc... and ask for the name of each person on the group and assign into the array
         */
        Scanner input = new Scanner(System.in);
        System.out.println("How many groups");
        int numOfGroups = input.nextInt();
        input.nextLine();

        String[][] names = new String[numOfGroups][];
//        for (int i = 0; i < numOfGroups; i++) {
//            System.out.println("Enter the names in a row");
//            names[i] = input.nextLine().trim().split(" ");
//        }
//
//        System.out.println(Arrays.deepToString(names));
        for (int i = 0; i < numOfGroups; i++) {
            System.out.println("how many students in the group " + (i + 1));
            int numOfPeople = input.nextInt();
            input.nextLine();

            names[i] = new String[numOfPeople];

            for (int j = 0; j < names[i].length; j++) {
                System.out.println("Enter the name");
                names[i][j] = input.next();
            }
        }
        System.out.println(Arrays.deepToString(names));
    }

    }


