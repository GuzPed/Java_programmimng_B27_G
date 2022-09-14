package day44_polymorphism.homework.building;

public class Runner {
    public static void main(String[] args) {

        House house1 = new House("Lawrenceville", 350000,5 );
        house1.pay();
        house1.mowLawn();
        System.out.println(house1);
        System.out.println(house1.numberOfResidents);
        System.out.println(house1.location);

        System.out.println("================================");

        Building house2 = new House("New York", 1000000, 35);
     //   house2.mowLawn(); building class does not have this method
        house1.pay();
        System.out.println(house2);
       // System.out.println(house2.numberOfResidents); //building class does not have this variable
        System.out.println(house2.location);

        System.out.println("================================");
        HasBackyard house3 = new House("NJ", 500000, 20);
    //    house3.pay();
        house3.mowLawn();
        System.out.println(house3);
    //    System.out.println(house3.numberOfResidents);
     //   System.out.println(house3.location);

        System.out.println(BuildingUtil.rent(house1));
        System.out.println(BuildingUtil.rent(house2));


        System.out.println(BuildingUtil.search("Great Falls"));


    }
}
