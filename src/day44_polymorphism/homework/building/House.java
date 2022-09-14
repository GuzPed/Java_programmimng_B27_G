package day44_polymorphism.homework.building;

public class House extends Building implements HasBackyard {
    /*
Create a class House
    child class of Building
    implements HasBackyard

    create instance variable
        int number of residents

    create a constructor to assign the location, price, and number of residents

    implement all abstract methods (give some print statements. Ex: Paying for House, or Going into Backyard)

    override the toString to print the location, price, and number of residents
     */

    int numberOfResidents;

    public House(String location, double price, int numberOfResidents) {
        super(location, price);
        this.numberOfResidents = numberOfResidents;
    }

    @Override
    public void pay() {
        System.out.println("Paying for House");
    }

    @Override
    public void mowLawn() {
        System.out.println("Going into Backyard");
    }

    @Override
    public String toString() {
        return "House{" +
                "numberOfResidents=" + numberOfResidents +
                ", location='" + location + '\'' +
                ", price=" + price +
                '}';
    }
}


