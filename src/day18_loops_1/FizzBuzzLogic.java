package day18_loops_1;

public class FizzBuzzLogic {
    public static void main(String[] args) {
        /*
        write a program that will check all the numbers from 1 - 50 and apply fizzbuzz logic to it (see previous task from class if you are not sure)
    1.  For numbers which are divisible by 3, print "Fizz" instead of the number.
    2.  For numbers which are divisible by 5, print "Buzz" instead of the number
    3.  For numbers which are a divisible by both 3 and 5, print "FizzBuzz" instead of the number
         */
        int limit = 50;
        int count = 1;

        while (count <=limit) {
            if ( count %3==0 && count%5==0) {
                System.out.println(count + " FizzBuzz");

            } else if (count%3==0) {
                System.out.println(count + " Fizz");

            } else if (count%5==0) {
                System.out.println(count + " Buzz");
            } else {
                System.out.println(count);
            }
            count++;

        }



        }







    }

