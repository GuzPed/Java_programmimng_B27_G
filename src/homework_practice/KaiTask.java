package homework_practice;

import java.util.Arrays;

public class KaiTask {
    public static void main(String[] args) {
        /*
        Write a Java program to insert an element (specific position) into an array
        [1, 2, 3, 4]
        insert 5 as the 2nd element (index 1)
        [1, 5, 2, 3]
         */
        int[] a ={1,2,3,4};
        int[] b = new int[a.length];

        for (int i=0,j=0; i<b.length;i++,j++) {
            b[i] = a[j];
            if (i==1) {
                b[i]=5;
                j--;
            }
           }
        System.out.println(Arrays.toString(b));

        System.out.println("====================================================");
        int[] c ={1,2,3,4};


        for (int i=c.length-1; i>1;i--) {
            c[i] = c[i-1];

        }
        c[1]=5;
        System.out.println(Arrays.toString(c));


    }
}
