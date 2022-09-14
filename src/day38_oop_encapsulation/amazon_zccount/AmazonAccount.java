package day38_oop_encapsulation.amazon_zccount;

public class AmazonAccount {
    /*
     instance variables:
        - userName (String)
        - email (String)
        - hasPrime (boolean)
        */
    private String userName;
    private String email;
    private boolean hasPrime;

    /*
    constructor:
        - initialize the fields
        */

    public AmazonAccount(String userName, String email, boolean hasPrime) {
        setUserName(userName);
        setEmail(email);
        setHasPrime(hasPrime);

//        this.userName = userName;
//        this.email = email;
//        this.hasPrime = hasPrime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isHasPrime() {
        return hasPrime;
    }

    public void setHasPrime(boolean hasPrime) {
        this.hasPrime = hasPrime;
    }

    /*
    encapsulate AmazonAccount

    methods: toString()
*/

    @Override
    public String toString() {
        return "AmazonAccount{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", hasPrime=" + hasPrime +
                '}';
    }
    /*
Create a class UseAmazon

    create an object of the AmazonAccount and verify the constructor, getters and setters and toString are working properly
     */



}
