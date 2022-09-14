package day26_multi_array;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {

        String[][] cydeo = {
                {"Alen", "Tina", "Alena", "Nargiza"},
                {"Anam", "Baz", "Busra", "Astap"},
                {"Rabia", "Shahad"},
                {"Ketino", "Eyulul", "Nadia"}
                        };
        System.out.println(cydeo.length); // how many inner 1d arrays //4
        System.out.println(cydeo[2].length); //2
        System.out.println(cydeo[0][3]); // nargiza
        System.out.println(Arrays.toString(cydeo[1])); //[Anam, Baz, Busra, Astap]
        System.out.println(Arrays.deepToString(cydeo));
        System.out.println();
        //how to loop through each inner array

        for (String[] eachInner :cydeo) {
            System.out.println(Arrays.toString(eachInner));
        }
        System.out.println();
        // how to go through each name in each array

        for (String[] eachInner :cydeo) {
            for (String each: eachInner) {
                System.out.println(each);
            }

            System.out.println(Arrays.toString(eachInner));
        }
        System.out.println();

//how to loop through each name and print the first letter in uppercas
        for (String[] eachInner :cydeo) {
            for (String each: eachInner) {
                System.out.println(each.substring(each.length()-1).toUpperCase());
            }

            System.out.println(Arrays.toString(eachInner));
        }
        System.out.println();
    }
}
