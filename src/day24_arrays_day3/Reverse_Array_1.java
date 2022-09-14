package day24_arrays_day3;

public class Reverse_Array_1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] reversed = new int[arr.length];

        for (int i=arr.length-1, y=0; i>=0; i--,y++) {
            reversed[y] = arr[i];
        }
        System.out.println(reversed);




    }
}
