package day21_nested_loop;

public class NestedStop {
    public static void main(String[] args) {
      outer:  for (int i=0; i<5;i++) {

      inner:      for (int j =0; j<3;j++) {
          if(i==3) break outer;
                System.out.println(i + " " + j);
            }
        }


    }
}
