package day44_polymorphism.homework.building;

import java.util.ArrayList;

public class BuildingMarket {
    /*
    create a class BuildingMarket
    create a main method

    create an ArrayList of Building
        -> this can hold objects of House, Apartment, & OfficeBuilding

    create a bunch of House, Apartment, & OfficeBuilding objects and store them into the ArrayList

    mini tasks:

        - Find the most expensive Buildings, print all its information
        - Find the least expensive Buildings, print all its information
        - Filter all the Buildings in one location(ex search for buildings in Chicago)
        - Filter all the Buildings within a certain price range
     */
    public static void main(String[] args) {

        ArrayList<Building> buildings = new ArrayList<>();
        buildings.add(new House("Lawrenceville", 350000,5));
        buildings.add(new House("Chicago", 1000000, 35));
        buildings.add(new Apartment("Great Falls", 100000, 45));
        buildings.add(new OfficeBuilding("Chicago", 150000000, 100));

        Building theMostExpensive = buildings.get(0);
        for (Building each: buildings){
            if (each.price>theMostExpensive.price){
                theMostExpensive = each;
            }
        }
        System.out.println(theMostExpensive);

        System.out.println("=====================================");
        Building theLeastExpensive = buildings.get(0);
        for (Building each: buildings){
            if (each.price<theLeastExpensive.price){
                theLeastExpensive = each;
            }
        }
        System.out.println(theLeastExpensive);

        System.out.println("=====================================");
       ArrayList<Building> chicago = new ArrayList<>();
        for (Building each: buildings){
            if (each.location.equalsIgnoreCase("Chicago")){
                chicago.add(each);
            }
        }
        System.out.println(chicago);
        System.out.println("=====================================");
        ArrayList<Building> prices = new ArrayList<>();
     for (Building each: buildings){
        if (each.price>100000){
            prices.add(each);
        }
    }
        System.out.println(prices);
}



}
