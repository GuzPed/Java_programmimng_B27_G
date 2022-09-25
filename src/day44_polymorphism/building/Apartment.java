package day44_polymorphism.building;

public class Apartment extends Building implements HasBalcony{

    int monthsOfLease;

    public Apartment(String location, double price, int monthsOfLease) {
        super(location, price);
        this.monthsOfLease = monthsOfLease;
    }


    @Override
    public void pay() {
        System.out.println("Paying rent for apartment");
    }

    @Override
    public void openBalcony() {
        System.out.println("Opening door for balcony");
    }

    @Override
    public String toString() {
        return super.toString() +
                ",  months Of Lease" + monthsOfLease;
    }
}
