package homework_practice.loops_practices;

public class Task1 {
    public static void main(String[] args) {
        //write a program that will add the number from 1-500

        int number1 = 1;
        int number2 = 500;
        int sum = 0;

        while (number1<=number2) {
            sum +=number1;
            number1++;

        }
        System.out.println(sum);

    }
}
