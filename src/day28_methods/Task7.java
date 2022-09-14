package day28_methods;

public class Task7 {
    /*
    Min Number
create a method that will accept an int array and return the smallest number from the array
     */

    public static void main(String[] args) {
        int[] arr= {15,50,-2,58,155,-25};

        System.out.println(minNumberOfArray(arr));

    }


    public static int minNumberOfArray(int[] arr) {
        int min=arr[0];
        for(int each: arr) {
            if (each<min) {
                min=each;
            }
        }
        return min;
    }

}
