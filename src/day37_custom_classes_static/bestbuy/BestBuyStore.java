package day37_custom_classes_static.bestbuy;

public class BestBuyStore {
    public static void main(String[] args) {
        //BestBuy.location = "Fairfax";    // location is an instance variable, so we need an object in order to access


        BestBuy store1= new BestBuy();
        store1.location = "Faifax";
        System.out.println(store1.location);


        System.out.println(BestBuy.headquarters); // this is a static variable, which means we can use the class name to access

        System.out.println(store1.headquarters); // this is valid syntax, but you should the class name to access not the instance references

        // other static members
        System.out.println(Math.PI); // PI is static
        // Arrays.sort(); //static

        System.out.println(Integer.MAX_VALUE); // wrapper class. static



    }



}
