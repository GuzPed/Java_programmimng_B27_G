package day28_methods;

import java.util.Scanner;

public class Test {

    public static int getDup(String[] arr) {
    int count =0;
   for (int i=0; i<arr.length; i++){


        for (int j=0; j<arr.length; j++){
            if (arr[i].equalsIgnoreCase(arr[j])) {
                count++;
            }
        }

    }
    return count;
}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] arr = new String[in.nextInt()];

        for(int i=0; i < arr.length; i++) {
            arr[i] = in.next();
        }

        System.out.println(getDup(arr));

    }


}