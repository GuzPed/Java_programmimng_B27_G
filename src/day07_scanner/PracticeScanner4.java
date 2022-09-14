package day07_scanner;
import java.util.Scanner;
public class PracticeScanner4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Could you please enter your random number ");
        int a = input.nextInt();
       boolean isDivisibleBy2 = a%2==0;
       boolean isDivisibleBy3 = a%3==0;
        boolean isDivisibleBy5 = a%5==0;

        System.out.println(a + " is divisible by 2: " + isDivisibleBy2);
        System.out.println(a + " is divisible by 3: " + isDivisibleBy3);
        System.out.println(a + " is divisible by 5: " + isDivisibleBy5);




   }

}
