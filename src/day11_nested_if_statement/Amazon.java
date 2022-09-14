package day11_nested_if_statement;

public class Amazon {
    public static void main(String[] args) {
        double price = 10.99;
        boolean isPrime = true;

        if (isPrime){
            System.out.println("free 2 day shipping");
        } else {
            if (price>=25) {
                System.out.println("free shipping available");
            } else {
                System.out.println("shipping cost is $2.99");
            }
        }





    }


}
