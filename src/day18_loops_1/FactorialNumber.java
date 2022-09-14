package day18_loops_1;

public class FactorialNumber {
    public static void main(String[] args) {
        /*
        write a program that calculates the factorial of a number:
    ex: 5! = 5 * 4 * 3 * 2 * 1 = 120
         */
        int number = 5;
        int factorialNumber =1;

        while (number >= 1) {
            factorialNumber*=number--;

        }

        System.out.println(factorialNumber);


    }


}
