package day38_oop_encapsulation;

public class TestBank {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount( 215478698, 1235487);

        System.out.println(account1.getAccountNumber());
        System.out.println(account1.getBalance());


    }


}
