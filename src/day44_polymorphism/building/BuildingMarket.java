package day44_polymorphism.building;

import java.util.ArrayList;

public class BuildingMarket {
    public static void main(String[] args) {

        ArrayList<Building> allBuildings = new ArrayList<>();
        allBuildings.add(new House("New York", 4000000,4));
        allBuildings.add(new Apartment("Atalanta", 4500000,10));
        allBuildings.add(new OfficeBuilding("Virginia", 600000,6));

        allBuildings.add(BuildingUtil.search("McLean")); // added the OfficeBuilding from the search method

        allBuildings.add(BuildingUtil.search("Great Falls"));

        Building mostExpensive = allBuildings.get(0);

        for (Building each: allBuildings){
            if (each.price > mostExpensive.price){
                mostExpensive = each;
            }
        }
        System.out.println(mostExpensive);


        ArrayList<Building> filteredBuildings = new ArrayList<>(allBuildings);

        filteredBuildings.removeIf(p-> p.price>=4500000 || p.price<=300000);
        System.out.println(filteredBuildings);


        System.out.println(((OfficeBuilding)mostExpensive).numberOfFloor); // reference of Building ---->refenece OfficeBuilding. it does not ressign the value. does not change the whole refenece
        //mostExpensive.numberOfFloor; // reference does not have a visibility


    }
}

