package homework_practice.loops_practices;

public class Task20 {
    public static void main(String[] args) {
        /*
        Print this shape:

    * * * * * * * *
    * * * * * * *
    * * * * * *
    * * * * *
    * * * *
    * * *
    * *
    *
         */
        for (int i=0; i<8; i++) {
            for (int j = 8; j >i; j-- ) {
                System.out.print("* ");
            }
            System.out.println();
        }




    }
}
