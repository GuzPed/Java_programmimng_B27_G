package day44_polymorphism.homework.building;

public class OfficeBuilding extends Building implements HasElevator{
    /*
    Create an class OfficeBuilding
    child class of Building
    implements HasElevator

    create instance variable
        int number of floors

    create a constructor to assign the location, price, and number of floors

    implement all abstract methods (give some print statements)

    override the toString to print the location, price, and number of floors
     */
    int numberOfFloors;

    public OfficeBuilding(String location, double price, int numberOfFloors) {
        super(location, price);
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public void pay() {
        System.out.println("paying for something");
    }

    @Override
    public void elevator(int floor) {
        System.out.println("let's go to " + floor + " floor");
    }

    @Override
    public String toString() {
        return "OfficeBuilding{" +
                "numberOfFloors=" + numberOfFloors +
                ", location='" + location + '\'' +
                ", price=" + price +
                '}';
    }
}
