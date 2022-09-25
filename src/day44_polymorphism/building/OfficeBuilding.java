package day44_polymorphism.building;

public class OfficeBuilding extends Building implements HasElevator{

    int numberOfFloor;

    public OfficeBuilding(String location, double price, int numberOfFloor) {
        super(location, price);
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public void pay() {
        System.out.println("Paying rent for office space");
    }

    @Override
    public void elevator(int floor) {
        System.out.println("we are going to floor " + floor);
    }

    public String toString(){
        return super.toString() + "Number of floors " + numberOfFloor;
    }

}
