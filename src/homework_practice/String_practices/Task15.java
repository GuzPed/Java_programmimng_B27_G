package homework_practice.String_practices;

public class Task15 {
    public static void main(String[] args) {
        /*
        [SMS parts] - We will do this together

Given a String in the following format:
Sender: <James Bond>. From Number: [202-123-3456]. + Message: {"I love programming and problem solving"}

Separate these parts and print them separately:
    Sender: actualSender
    Number: actualNumber
    Message: actualMessage
         */

        String message = "<James Bond>. From Number: [202-123-3456]. + Message: {\"I love programming and problem solving\"}";

        int indexOf1 = message.indexOf("<");
        int indexOf2 = message.indexOf(">");
        int indexOf3 = message.indexOf("[");
        int indexOf4 = message.indexOf("]");
        int indexOf5 = message.indexOf("{");
        int indexOf6 = message.indexOf("}");

        System.out.println("Sender: " + message.substring(indexOf1+1, indexOf2));
        System.out.println("Number: " + message.substring(indexOf3+1,indexOf4));
        System.out.println("Message: " + message.substring(indexOf5+1,indexOf6));



    }
}
