package homework_practice.loops_practices;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String colors ="";
        int number =0;

        while (number++ <3) {
            System.out.println("enter your color");
            String userColor = input.nextLine();

            if (!colors.contains(userColor)) {  // ! contain
                colors += userColor + " ";  //red   yellow


            } else {
                System.out.println("colors should be unique");
                number--;
            }



        }
        System.out.println(colors);


    }



}
