package day11_nested_if_statement;

public class Dollar {
    public static void main(String[] args) {
        int money = 65; // where 100 is 1 dollar
        int quaters = money/25;
        money %=25;
        int dimes = money/10;
        money %=10;
        int nickles = money/5;
        money %=5;
        int penny = money;

        System.out.println(quaters + " quaters");
        System.out.println(dimes + " dimes");
        System.out.println(nickles + " nickels");
        System.out.println(penny + " pennies");



    }


}
