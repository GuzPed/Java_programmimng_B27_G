package day19_loops_2;

public class PrimeNumber {
    public static void main(String[] args) {
        /*
        [IQ] Prime number
Give a number determine if it is a prime number. A prime number is a number that is only divisible by 1 and itself.
Ex:
	Input:
		11
	Output:
		prime
Ex:
	Input:
		10
	Output:
		not prime
         */
        int number = 10;
        String result = "";
        boolean isPrime = true;

        if (number<2) {
            System.out.println("Not Prime");
            System.exit(0); // forcing to stop the program
        }


        for (int a = 2; a < number; a++) {
           if (number%a==0); {
               isPrime = false;
            }
        }
        System.out.println(isPrime? "Prime": "Not Prime");



    }

}
