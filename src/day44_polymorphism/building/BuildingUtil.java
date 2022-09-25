package day44_polymorphism.building;

public class BuildingUtil {
    public static void main(String[] args) {

        House house1 = new House("Paris", 100_000_000, 10);

        Building house2 = new House("New York", 2_000_000, 4);

        HasBackyard house3 = new House("Seattle", 3_000_000, 5 );

        // house3.pay();   // invalid because the HasBackyard does not have visibility to this method

        house3.mowLawn();
        System.out.println(rent(house1));
        System.out.println(rent(new OfficeBuilding("Texas", 123_000, 5)));
        System.out.println(rent(new Apartment("Nevada", 15222336, 2)));

        System.out.println(search("Fairfax"));
        System.out.println(search("McLean"));



    } //main method ends here

     /*
        create a class BuildingUtil

    create a static method Rent(Building obj)
        return: double
        parameters: Building type

        implementation:
            if the Building is House type return 1500
            if the Building is Apartment type return 800
            if the Building is OfficeBuilding type return 2000


    */
    public static double rent(Building buildings){

        if (buildings instanceof House){
            return 1500;
        } else if (buildings instanceof Apartment){
            return 800;
        } else if (buildings instanceof OfficeBuilding){
            return 2000;
        } else {
            return -1;
        }
    }

    public static Building search(String location){
        if (location.equals("Great Falls")){
            return new House("Great Falls", 500_000, 4);
        } else if (location.equals("Fairfax")){
            return new Apartment("Fairfax", 250000, 6);
        } else if (location.equals("McLean")){
            return new OfficeBuilding("McLean", 2000000, 6);
        }
        return null;
    }





}
