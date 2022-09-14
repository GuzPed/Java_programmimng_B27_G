package day28_methods;

public class Task3 {
    /*
    Currency Converter

create a method that will accept a currency type(String) and a currency amount (double)[as dollars] and convert the currency from dollars to a different type

Use the following information to convert from given dollars to the desired currency type

1 dollar = 0.91 euro
1 dollar = 121.03 yen
1 dollar = 14.85 lira
1 dollar = 1,217.52 won
1 dollar = 181.45 rupee

Note: Don't worry about decimal formats, focus on method

Ex:
	Input:
		euro, 100

	Output:
		91

Ex:
	Input:
		yen, 50

	Output:
		6051.5
     */

    public static double currencyConverter(String type, double amount) {
        double converter=0.0;
        double oneDollarToEuro = 0.91;
        double oneDollarToYen = 121.03;
        double oneDollarToLira = 14.85;
        double oneDollarToWon = 1217.52;
        double oneDollarToRupee = 181.45;

        switch (type.toLowerCase()){
            case "euro":
                converter=amount * oneDollarToEuro;
                break;
            case "yen":
                converter=amount * oneDollarToYen;
                break;
            case "lira":
                converter=amount * oneDollarToLira;
                break;
            case "won":
                converter=amount * oneDollarToWon;
                break;
            case "rupee":
                converter=amount * oneDollarToRupee;
                break;

        }
        return converter;

    }


    public static void main(String[] args) {
        System.out.println(currencyConverter("euro", 100));
    }





}
