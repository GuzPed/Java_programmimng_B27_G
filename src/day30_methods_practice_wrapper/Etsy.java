package day30_methods_practice_wrapper;

public class Etsy {
    public static void main(String[] args) {
        String s = "Item(s) total: $144.99";

        double price =Double.parseDouble( s.split(" ")[2].substring((1)));
        System.out.println(price);

        if (price>=100) {
            System.out.println("check if the shipping is free");
        }

    }
}
