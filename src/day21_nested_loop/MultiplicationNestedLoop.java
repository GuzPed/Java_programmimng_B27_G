package day21_nested_loop;

public class MultiplicationNestedLoop {
    public static void main(String[] args) {
        int mul =0;

        for (int i=1; i<=10;i++) {
            System.out.println("Table for " + i);
          for (int j=1; j<=10; j++) {
              System.out.print(i+ " * " + j + " = " + i*j + " | ");
          }
            System.out.println();


        }


    }
}
