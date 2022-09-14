package day40_oop_inheritance.homework.device;

public class Tv extends Device {
    /*
    Create a class called TV:
- attributes: brand, model, price, wireless
- methods: toString(),
	useDevice(): Override to print Using TV
     */

    public Tv(String brand, String model, double price, boolean wireless) {
        super(brand, model, price, wireless);
    }

    @Override
    public String useDevice(){
        return "using TV";
    }


}
