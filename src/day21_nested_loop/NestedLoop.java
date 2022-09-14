package day21_nested_loop;

public class NestedLoop {
    public static void main(String[] args) {
        for (int i= 0; i<3; i++) {
            System.out.println("Hello Wolrd");
        }

        System.out.println("Hello Universe");

        System.out.println("--------------------------------------------------");

        for (int j=0; j<4; j++) {
            for (int i= 0; i<3; i++) {
                System.out.println("Hello Wolrd");
            }

            System.out.println("Hello Universe");


        }




    }


}
