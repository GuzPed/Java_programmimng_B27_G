package day39_oop_inheritance.access.b;

import day39_oop_inheritance.access.a.House;

public class TownHouse extends House {
    //in different package
    public static void main(String[] args) {
        TownHouse house2 = new TownHouse();
        house2.address = "sdfsf";
         house2.city = "NY";
      //   house2.state = "NY";  accessible in the same package only. DEFAULT
        //house.zipcode;  is private, so only accessible in the same class
    }
}
