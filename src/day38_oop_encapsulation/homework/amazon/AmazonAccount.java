package day38_oop_encapsulation.homework.amazon;

public class AmazonAccount {
    /*
    Create a class AmazonAccount

    instance variables:
        - userName (String)
        - email (String)
        - hasPrime (boolean)

    constructor:
        - initialize the fields

    encapsulate AmazonAccount

    methods: toString()

Create a class UseAmazon

    create an object of the AmazonAccount and verify the constructor, getters and setters and toString are working properly
     */
    private String userName;
    private String email;
    private boolean hasPrime;

    public AmazonAccount(String userName, String email, boolean hasPrime) {
        this.userName = userName;
        setEmail(email);
        this.hasPrime = hasPrime;
    }

    @Override
    public String toString() {
        String result =  "AmazonAccount - " +
                "userName='" + userName + '\'' +
                ", hasPrime=" + hasPrime;

        if (email !=null){
            result +=  ", email='" + email;
        }
        return result;
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
        if (email.contains("@")){
            this.email = email;
        }
    }

    public boolean isHasPrime() {
        return hasPrime;
    }

    public void setHasPrime(boolean hasPrime) {
        this.hasPrime = hasPrime;
    }
}
