package day39_oop_inheritance.discorduser;

public class Admin extends DiscordUser {
    /*
    Create a class Admin

    - Admin class inherits DiscordUser class

    - create constructor to call parent constructor and set up variables (role - Admin, name, id)

    - create method:
        createChannel()
            Example output: prints Creating new discord channel
     */

    public Admin(String role, String name, int id) {
        super(role, name, id);
    }

    public void createChanne(){
        System.out.println("Creating new discord channel");
    }




}
