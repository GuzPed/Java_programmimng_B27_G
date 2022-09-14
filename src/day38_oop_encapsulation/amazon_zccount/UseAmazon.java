package day38_oop_encapsulation.amazon_zccount;

public class UseAmazon {
    public static void main(String[] args) {
        AmazonAccount amz = new AmazonAccount("abdsc", "dsfsdfas@gmail.com", true);

        System.out.println(amz);

        System.out.println(amz.getEmail());
        amz.setHasPrime(false);
        System.out.println(amz);




    }
}
