package day39_oop_inheritance.discorduser;

public class Student extends DiscordUser{
    /*
    Create a class Student

    - Student class inherits DiscordUser class

    - create constructor to call parent constructor and set up variables (role - Student, name, id)

    - create method:
        sendMessage()
            Example output: prints Sending message to class chat
     */

    public Student(String role, String name, int id) {
        super(role, name, id);
    }



    public void sendMessage(){
        System.out.println("Sending message to class chat");
    }
}
