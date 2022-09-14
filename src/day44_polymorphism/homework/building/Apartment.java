package day44_polymorphism.homework.building;

public class Apartment extends Building implements HasBalcony{
    /*
    Create an class Apartment
    child class of Building
    implements HasBalcony

    create instance variable
        int months of lease

    create a constructor to assign the location, price, and months of lease

    implement all abstract methods (give some print statements)

    override the toString to print the location, price, and months of lease
     */
    int monthsOfLease;

    public Apartment(String location, double price, int monthsOfLease) {
        super(location, price);
        this.monthsOfLease = monthsOfLease;
    }

    @Override
    public void pay() {
        System.out.println("Paying for lease");
    }

    @Override
    public void openBalcony() {
        System.out.println("Open your balcony");
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "monthsOfLease=" + monthsOfLease +
                ", location='" + location + '\'' +
                ", price=" + price +
                '}';
    }
}
