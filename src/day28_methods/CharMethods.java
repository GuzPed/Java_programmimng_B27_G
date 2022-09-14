package day28_methods;

public class CharMethods {

    public static void getUpperAtoZ() {
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            System.out.print(letter + " ");
        }
        System.out.println();
    }

    public static void getLowerAtoZ() {
        for (char letter = 'a'; letter <= 'z'; letter++) {
            System.out.print(letter + " "); // print((char)i)
        }
        System.out.println();
    }

    public static void main(String[] args) {
        getLowerAtoZ();
        getUpperAtoZ();
    }

}

