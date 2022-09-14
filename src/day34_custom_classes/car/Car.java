package day34_custom_classes.car;

public class Car {
    String model;
    int year;
    String  color;
    int fuelLevel;

    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", fuelLevel=" + fuelLevel +
                '}';
    }

    public void drive(){
        System.out.println("Driving " + model);
        fuelLevel-=5;
    }

    public void fillTank() {
        System.out.println("Filling tank ");
        fuelLevel =100;
    }

    public boolean isLow(){
        if (fuelLevel < 25) {
            return true;
        } else {
            return false;
        }
    }







}
