package day09_if_statements;

public class PayDay {
    public static void main(String[] args) {
        double hourlyRate = 60;
        int hourPerWeek = 50;
        double netPay, netPay1;
        if (hourPerWeek > 40) {
            //overtime calculation
            int overTimeHours = hourPerWeek -40;
            netPay = hourlyRate * 40;


            System.out.println("So your overtime payment is " + ((hourPerWeek-40)*hourlyRate*1.5+netPay));

        }
        else {
            netPay = hourPerWeek*hourlyRate;
            System.out.println("no overtime. your Netpayment ");
        }

    }

}
