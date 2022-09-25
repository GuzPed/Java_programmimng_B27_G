package day44_polymorphism.building;

public class House extends Building implements HasBackyard{

    int numberOfResidents;

    public House(String location, double price, int numberOfResidents) {
        super(location, price);
        this.numberOfResidents = numberOfResidents;
    }

    @Override
    public void mowLawn() {
        System.out.println("Mowing the lawn in the backyard");
    }

    @Override
    public void pay() {
        System.out.println("Paying mortgage");
    }

    @Override
    public String toString(){
        return super.toString() + ", Number of residence " + numberOfResidents;
    }


}
