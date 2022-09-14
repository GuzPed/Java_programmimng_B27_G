package day28_methods;

public class Task8 {
    /*
    Max Number

create a method that will accept an int array and return the biggest number from the array
     */
    public static void main(String[] args) {
        int[][] arr = {
                {5, 1, 24, 5},
                {24, 1, 5, 2},
                {4, 1, 5, 10},
                {4, 1, 5, 1,8, 55,10}
        };

        System.out.println(maxNumber(arr));
    }

    public static int maxNumber(int[][] arr) {
        int max = arr[0][0];

        for (int[] eachOuter: arr) {
            for(int eachInner: eachOuter) {
                if (eachInner > max) {
                    max=eachInner;
                }
            }
            }
        return max;
    }

}
