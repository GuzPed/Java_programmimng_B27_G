package day20_loops_3;

public class CountHi {
    public static void main(String[] args) {
        //counting how many times hi is in the String

        String s = "abhicdhelhilofrhiidayhi";

        // approach 1: while loop and delete the first occurrence each time

        int count = 0;
        while (s.contains("hi")) {
            count++;
           s= s.replaceFirst("hi", ".");
            System.out.println(s);
        }
        System.out.println(count);

        //approach2: for loop to check one index at a time, but when there is an h we will check another index
        String s2 = "abhicdhelhilofrhiidayhih";
        int count2 = 0;
        for  (int i = 0; i <s2.length()-1; i++) {
            if (s2.charAt(i) == 'h' && s2.charAt(i+1)=='i') {
                count2++;

            }
        }
        System.out.println(count2);
 // approach3: using indexes to check every 2 characters
        String s3 = "abhicdhelhilofrhiidayhih";
        int count3 = 0;

        for (int i = 0; i< s3.length()-1; i++ ) {

            if (s3.substring(i,i+2).equals("hi")) {
                count3++;
            }
        }
        System.out.println(count3);

    }
}
