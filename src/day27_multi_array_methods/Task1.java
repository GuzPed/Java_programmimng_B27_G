package day27_multi_array_methods;

public class Task1 {
    /*
    create a method that can print odd numbers between 1-100 in the
same line saperated by space

create a method that can print even numbers between 1-100 in the
same line saperated by space
     */
    public static void oddNumbers() {

        for (int i=1; i<=100;i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
       public static void evenNumbers() {

            for (int i=1; i<=100;i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("Odd numbers");
        oddNumbers();


        System.out.println("Even numbers");

        evenNumbers();
    }


}
