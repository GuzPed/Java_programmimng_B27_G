package day44_polymorphism;

import day43_abstraction.clothes.Clothes;
import day43_abstraction.clothes.HasHood;
import day43_abstraction.clothes.Jacket;
import day43_abstraction.clothes.Tshirt;

import java.util.ArrayList;

public class Store {
    public static void main(String[] args) {

        Tshirt shirt1 = new Tshirt();
        Clothes shirt2 = new Tshirt();

        Jacket jacket1 = new Jacket();
        Clothes jacket2 = new Jacket();
        HasHood jacket3 = new Jacket();

        Clothes[] inventory = new Clothes[7];
        inventory[0]=new Tshirt();
        inventory[1]=shirt1;
        inventory[2]=shirt2;
        inventory[3]=jacket1;
        inventory[4]=jacket2;
     //   inventory[5]=jacket3;
        inventory[5]=new Hat();
        inventory[6]=new Hat();


        ArrayList<Clothes> list = new ArrayList<>();
        list.add(new Jacket());
        list.add(new Tshirt());
        list.add(new Hat());

        for (Clothes each: inventory){
            each.wear();
        }

        buy(new Jacket());
        buy(new Hat());
        buy(new Tshirt());


    }

    public static void buy(Clothes clothes){
        if (clothes instanceof Jacket){
            System.out.println("Jackets cost 29.99");
        } else if (clothes instanceof Tshirt){
            System.out.println("Tshirt is 9.99");
        } else if (clothes instanceof Hat){
            System.out.println("Hats cost 19.99");
        }

    }

}


class Hat extends Clothes{
    @Override
    public void wear() {
        System.out.println("Wearing HAt");
    }
}
