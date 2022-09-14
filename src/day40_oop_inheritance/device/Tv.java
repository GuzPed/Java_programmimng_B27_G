package day40_oop_inheritance.device;

public class Tv extends Device {
    /*
    Create a class called TV:
- attributes: brand, model, price, wireless
- methods: toString(),
	useDevice(): Override to print Using TV
     */

    public Tv(String brand, double price, boolean isWireless) {
        super(brand, "TV", price, isWireless);
    }

    @Override
    public String useDevice() {
        return " Using TV";
    }
}
