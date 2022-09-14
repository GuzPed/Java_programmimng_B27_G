package homework_practice.loops_practices;

public class Task21 {
    public static void main(String[] args) {
        /*
        Print this shape:

    * * * * * * * *
      * * * * * * *
        * * * * * *
          * * * * *               8*8
            * * * *
              * * *
                * *
                  *
         */

        for (int i = 0; i <=8; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print("  ");
            }
            for (int j = (8-i); j >=0; j--) {
            System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

/*
Print this shape:

                   *
                 * *
               * * *
             * * * *              8*8
           * * * * *
         * * * * * *
       * * * * * * *
     * * * * * * * *
 */
        for (int i = 0; i < 8; i++) {
            for (int j = (8-i); j >=0; j--) {
                System.out.print("  ");
            }
            for (int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
