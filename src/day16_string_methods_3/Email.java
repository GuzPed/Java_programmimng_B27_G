package day16_string_methods_3;

public class Email {
    public static void main(String[] args) {
        String email = "saim@cydeo.com";
        int indexOfAt = email.indexOf('@');
        int indexOfDot = email.indexOf('.');


        String name = email.substring(0, indexOfAt);
        String domain = email.substring(indexOfAt+1, indexOfDot);
        System.out.println(name);
        System.out.println(domain);

    }
}
