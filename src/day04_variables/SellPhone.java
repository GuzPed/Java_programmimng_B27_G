package day04_variables;

public class SellPhone {
    public static void main(String[] args) {
        String brand = "Apple";
        String model = "iPhone X";
        String color = "Rose Gold";
        double price = 1000.99;
        boolean hasCamera = true;
        int size = 128;
        char sim = 'A';
        System.out.println("\t\tPhone Information: \nBrand is " + brand + "\nModel " + model +" in " + color);
        System.out.println("with " + size + "gb and the price is $" + price);
        System.out.println("the sim type is " + sim + " and has a camera " + hasCamera);

        // alternative way
        String report = "\t\tPhone Information: \nBrand is " + brand + "\n" + " with " + size + " gb and the price is $ " + price + "\nthe sim type is " + sim + " and has a camera " + hasCamera;
        System.out.println(report);

        brand = "Samsung";
        System.out.println(report); // will not print Samsung, because report already had a value which was saved in string report



    }
}
