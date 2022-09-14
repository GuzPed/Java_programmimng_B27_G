package day10_if_else_statements;

public class SalesBonus {
    public static void main(String[] args) {
        int salesAmount = 10_000;
        int bonus = 0;
        if (salesAmount < 10_000) {
            System.out.println( bonus);
        }
        if ( salesAmount >=10_000 && salesAmount < 15_000) {
            bonus = 5000;

        }
        if (salesAmount>=15_000) {
            bonus = 7000;

        }
        System.out.println("you get a bonus $" + bonus );
        System.out.println( "sales: " + salesAmount );


    }


}
