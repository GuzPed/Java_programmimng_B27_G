package day23_arrays_day2;

public class Average_3 {
    public static void main(String[] args) {
        double[] prices = {13.99, 19.14, 3.112, 65.332} ;
        int sum =0;
        int sum1=0;
        for (double price: prices) {
            sum +=price;

        }
        System.out.println(sum/ prices.length);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        for (int i=0; i< prices.length;i++ ) {
            sum1 += prices[i];
        }

        System.out.println(sum1/ prices.length);




    }
}
