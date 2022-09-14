package day28_methods;

public class Task2 {
    /*
    Create a method that accept an int array. Take the sum of all the numbers and return the sum
     */

    public static void main(String[] args) {
        int[] arr = {5, 15, 13, 85, 92, 1};

        int sum = sumOfArray(arr)+44;
        System.out.println(sum);

    }

    public static int sumOfArray(int[] arr) {
        int sum=0;
         for (int each: arr) {
             sum+=each;
         }
        return sum;

    }


}
