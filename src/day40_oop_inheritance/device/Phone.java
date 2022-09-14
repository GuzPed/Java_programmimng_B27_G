package day40_oop_inheritance.device;

public class Phone extends Device{
    /*
    Create a class called Phone:
- attributes: brand, model, price, wireless
- methods: toString(),
	useDevice(): Override to print Using Phone
     */

    public Phone(String brand, String model, double price, boolean isWireless) {
        super(brand, model, price, isWireless);
    }

    @Override
    public String useDevice() {
        return  " Using Phone";
    }
}
