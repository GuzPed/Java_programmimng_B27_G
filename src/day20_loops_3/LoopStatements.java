package day20_loops_3;

public class LoopStatements {
    public static void main(String[] args) {
        for (int i =1; i<=5;i++) {
            System.out.print(i+ " ");
        }
        System.out.println();
        for (int i=1; i<=5; i++) {
            if (i==4) {
                break; // loop stops at 4,
            }System.out.print(i+ " ");
        }
        System.out.println();
        for (int i=1; i<=5; i++) {
            if (i==3) {
                continue; // the loop skipd the iterations when i is 3, so 3 isn't printed
            }System.out.print(i+ " ");
        }

        System.out.println();
        for (int i=1; i<100; i++) {
            if (i%2==0) {
                continue;
            }System.out.print(i+ " ");
        }




    }


}
