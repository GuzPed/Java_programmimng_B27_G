package day03_variables;

public class Store {
    public static void main(String[] args) {
        int numberOfItems = 1000;
        System.out.println(numberOfItems + " in the store");

        numberOfItems = 700;  //reassigned 700 into  variable
        System.out.println(numberOfItems + " after sales");

        int totalAfterShipment = numberOfItems + 5000;
        System.out.println(totalAfterShipment);
        System.out.println("totalAfterShipment = " + totalAfterShipment);
        System.out.println("numberOfItems = " + numberOfItems);

        double totalCost = 1_000_000.99;  //1,000,00.99 - commas are not valid for java syntex. so we can use _, to make the number readable
        System.out.println(totalCost);

        float f = 19.99F; // aading the letter f/F will let the compiler this is a float number, not a double number
        float f2 = 100; // you can store int in float, smaller value toa bigger - we can do it. otherwise, we cannot. INT is smaller than FLOAT. it will add .0
        System.out.println("f = " + f);
        System.out.println("f2 = " + f2); // will print 100.0

        long population = 8_000_000_000L;// adding L will change type ink to long.
        System.out.println("population = " + population);

        long pop2 = 1_000_000;// L we don't need it because 1 million is valid for int types, and that type can automatically be converted to a bigger type
        System.out.println("pop2 = " + pop2);





    }


}
