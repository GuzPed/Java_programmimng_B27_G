package day40_oop_inheritance.homework.device;

public class Phone extends Device{

    public Phone (String brand, String model, double price, boolean wireless){
        super(brand, model, price, wireless);
    }

    public String useDevice(){
        return " using phone";
    }

}
