package day37_custom_classes_static.debit_card;

public class RunningClass {
    public static void main(String[] args) {

       DebitCard my = new DebitCard(1523647895625484L, "Guzel Khis", 1500 );

        System.out.println(my);

       DebitCard yours = new DebitCard(1526456187536654L, "Mama mama", "mastercard", 5698656, 15697);

        System.out.println(yours);




    }
}