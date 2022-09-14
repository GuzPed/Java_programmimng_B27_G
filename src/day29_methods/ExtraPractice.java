package day29_methods;

public class ExtraPractice {

    public static void main(String[] args) {

        int[] nums ={1,2,3,5,48};

        System.out.println(sumFromArray(nums));  // int sum = sumFromArray(nums)

        System.out.println(currencyConverter("yen", 100));

        String name = "lira";
        double price = 800;
        System.out.println(currencyConverter(name, price));

    }


    /*
    Create a method that accept an int array. Take the sum of all the numbers and return the sum
     */
    public static int sumFromArray (int[] nums) {

        int sum=0;
        for (int eachNum: nums) {
            sum+=eachNum;
        }
        return sum;

    }

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

    public static double currencyConverter(String type, double dollars) {
        double converted =0.0;
        switch (type.toLowerCase()) {
            case "euro":
                converted = dollars * 0.91;
                break;
            case "yen":
                converted = dollars * 121.03;
                break;
            case "lira":
                converted = dollars * 14.85;
                break;
            case "won":
                converted = dollars * 1217.52;
                break;
            case "rupee":
                converted = dollars * 181.45;
                break;
            default:
                System.out.println("We can't tp convert to " + type);
        }

return  converted;

    }




}
