package day44_polymorphism.homework.building;

public class BuildingUtil {
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
    public static double rent(Building obj){
        if (obj instanceof House){
            return 1500;
        } else if (obj instanceof Apartment){
            return 800;
        } else if (obj instanceof OfficeBuilding){
         return 2000;
        }
        return 0;
    }
    /*
     create a static method search(String location)
        return: Building
        parameters: String location

        implementation
            if the location is Great Falls return a House object with:
                location: Great Falls
                price: 500_000
                number of residents: 4

            if the location is FairFax return a Apartment object with:
                location: FairFax
                price: 250_000
                month for lease: 6

            if the location is McLean return a OfficeBuilding object with:
                location: McLean
                price: 2_000_000
                number of floors: 6

    Run the methods in a main method to test them out
     */

    public static Building search(String location){
        Building obj=null;
        if (location.equalsIgnoreCase("Great Falls")){
            obj= new House("Great Falls", 500_000, 4);
        } else if (location.equalsIgnoreCase("FairFax")){
            obj= new Apartment("FairFax", 250_000, 6);
        } else if (location.equalsIgnoreCase("McLean")){
            obj= new OfficeBuilding("McLean", 2_000_000,6);
        }
        return obj;
    }


}
