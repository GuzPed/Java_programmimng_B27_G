package day12_switch_statement;

public class Starbucks {
    public static void main(String[] args) {
        String coffee = "grande";
        double price = 0;
        int calories = 0;

        switch (coffee) {
            case "tall":
                price =2.50;
                calories = 100;
                break;
            case "grande":
                price =4.00;
                calories = 150;
                break;
            case "venti" :
                price =4.50;
                calories = 250;
                break;

        }
        if (price!=0 && calories!=0) {


            System.out.println(" Size: " + coffee + " is " + calories + " calories and costs $" + price);
        }


    }


}
