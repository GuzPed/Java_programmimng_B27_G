package day39_oop_inheritance.access.b;

public class RunnerB {
    public static void main(String[] args) {

        TownHouse house2 = new TownHouse();
        house2.address = "sdfsf";
        // house2.city = "NY"; no accessible outside of the package
        //house.zipcode;  is private, so only accessible in the same class




    }

}
