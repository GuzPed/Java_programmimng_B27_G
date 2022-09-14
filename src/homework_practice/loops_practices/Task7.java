package homework_practice.loops_practices;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secretNum = 55;
        boolean isSecret = true;
        System.out.println("guess number ");

        while (isSecret ) {
        int userGuess = input.nextInt();

        if (userGuess > secretNum) {
            System.out.println("number is smaller");
        } else if (userGuess<secretNum) {
            System.out.println("number is bigger");
        } else {
            System.out.println("you won");
            System.out.println("the secret number is  " + userGuess);;
            break;
            // isSecret = false;
        }


        }




    }
}
