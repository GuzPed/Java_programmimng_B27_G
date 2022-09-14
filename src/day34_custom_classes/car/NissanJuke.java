package day34_custom_classes.car;

public class NissanJuke {
    public static void main(String[] args) {

        Car nissanJuke = new Car();
        nissanJuke.model = "Nissan";
        nissanJuke.year = 2017;
        nissanJuke.color = "grey";
        nissanJuke.fuelLevel =15;

        System.out.println(nissanJuke);

        nissanJuke.drive();
        System.out.println(nissanJuke);
        System.out.println(nissanJuke.isLow());

        nissanJuke.fillTank();
        System.out.println(nissanJuke);

        System.out.println(nissanJuke.isLow());





    }
}
