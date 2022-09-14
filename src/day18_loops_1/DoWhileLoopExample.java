package day18_loops_1;

public class DoWhileLoopExample {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i); }
        while (false); // the do block executed first, then the boo

        System.out.println("_____________________");


        do {
            System.out.println(i);
        i++;
        }        while (i<=10);


    }


}
