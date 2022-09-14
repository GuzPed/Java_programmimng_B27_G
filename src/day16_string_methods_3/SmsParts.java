package day16_string_methods_3;

public class SmsParts {
    public static void main(String[] args) {
        /*  [SMS parts] - We will do this together
Given a String in the following format:
Sender: <James Bond>. From Number: [202-123-3456]. + Message: {"I love programming and problem solving"}

Separate these parts and print them separately:
    Sender: actualSender
    Number: actualNumber
    Message: actualMessage
         */
        String info = "<James Bond>. From Number: [202-123-3456]. + Message: {\"I love programming and problem solving\"}";

        int infexOfLessThan = info.indexOf("<");
        int indexOfMoreThan = info.indexOf(">");

        String name = info.substring(infexOfLessThan+1, indexOfMoreThan);

        int indexOfBracket1 = info.indexOf("[");
        int indexOfBracket2 = info.indexOf("]");

        String phone = info.substring(indexOfBracket1+1, indexOfBracket2);

        int indexOfCurlyBracket1 = info.indexOf("{");
        int indexOfCurlyBracket2 = info.indexOf("}");

        String message = info.substring(indexOfCurlyBracket1+1, indexOfCurlyBracket2);

        System.out.println("Sender: " + name );
        System.out.println("Number: " + phone);
        System.out.println("Message: " + message);







    }
}
