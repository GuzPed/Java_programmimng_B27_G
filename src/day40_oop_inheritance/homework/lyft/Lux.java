package day40_oop_inheritance.homework.lyft;

public class Lux extends Lyft{

    @Override
    public double calculateRate(double miles) {
        return super.calculateRate(miles) + super.calculateRate(miles)*0.2;
    }
}
