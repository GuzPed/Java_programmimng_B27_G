package day18_loops_1;

public class EvenAndOdd {
    public static void main(String[] args) {
        int limit = 100;
        int count = 1;
        // printing all the even numbers:
        while (count <=limit) {
            if (count%2==0) {
                System.out.print(count + " ");
                            }count++;
        }
        System.out.println();
        System.out.println("++++++++=+++++++++++++++++++++++");

        // print all the odd numbers from limit to 1, backward order
        int back = limit;

        while (back>=1) {
            if (back%2!=0) {
                System.out.print(back +" ");
            } back--;
        }



    }

}
