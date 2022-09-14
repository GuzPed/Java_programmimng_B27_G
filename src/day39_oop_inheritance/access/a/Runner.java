package day39_oop_inheritance.access.a;

import day39_oop_inheritance.access.b.TownHouse;

public class Runner {
    public static void main(String[] args) {
        //in the same package
        Condo condo = new Condo();
        condo.address = "1312 l";
        condo.city = "NY";
        condo.state = "NY";
        //condo.zipcode - is private


        TownHouse townhouse1 = new TownHouse();
        townhouse1.address = "1312 l";
        townhouse1.city = "NY";
       // townhouse1.state = "NY";
        //townhouse1.zipcode -is private

    }
}
