package day16_string_methods_3;

public class IndexOfExample {
    public static void main(String[] args) {
        String s = "lollipop";
                  //01234567
        System.out.println("index of l "  + s.indexOf('l'));
        System.out.println("last index of l " + s.lastIndexOf('l'));

        System.out.println("index of i "  + s.indexOf('i'));
        System.out.println("last index of i " + s.lastIndexOf('i'));

        System.out.println("index of p "  + s.indexOf('p'));
        System.out.println("last index of p " + s.lastIndexOf('p'));

        System.out.println("index of e "  + s.indexOf('e'));
        System.out.println("index of P "  + s.indexOf('P'));
        System.out.println(s.lastIndexOf('I'));

        System.out.println("index od pop " + s.indexOf("pop")); //5. fisrt character
        System.out.println("index od Pop " + s.indexOf("Pop")); //-1

    }

}
