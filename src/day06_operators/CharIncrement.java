package day06_operators;

public class CharIncrement {
    public static void main(String[] args) {

        char letter = 'A';
        System.out.println(letter++); //A
        System.out.println(letter++);//B
        System.out.println(letter++);//C
        System.out.println(letter++);//D
        System.out.println(letter++);//E
        System.out.println(letter++);//F
        System.out.println(letter++);//G

        System.out.println();

        char letter2 = 'a';
        System.out.println(++letter2);//b
        System.out.println(++letter2);//c
        System.out.println(++letter2);//d
        System.out.println(++letter2);//e

        System.out.println("----------------------------------");

        char digits = '9';
        System.out.println(digits--);//9
        System.out.println(digits--);//8
        System.out.println(digits--);//7
        System.out.println(digits--);//6
        System.out.println(digits--);//5

        System.out.println("----------------------------------");

        char specol = '@';
        System.out.println(specol--);
        System.out.println(specol--);
        System.out.println(specol--);
        System.out.println(specol--);
        System.out.println(specol--);


        System.out.println("----------------------------------");
        System.out.println((int)digits);

        System.out.println("----------------------------------");
        System.out.println(65);
        System.out.println((char)65);






    }


}
