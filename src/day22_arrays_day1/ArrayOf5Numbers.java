package day22_arrays_day1;

public class ArrayOf5Numbers {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        System.out.println(numbers[4]);
        System.out.println(numbers[3]);
        System.out.println(numbers[2]);
        System.out.println(numbers[1]);
        System.out.println(numbers[0]);

        System.out.println("=======================================");
        for (int i = numbers.length-1; i >=0; i--) {
            System.out.print(numbers[i] + " ");

        }


    }
}
