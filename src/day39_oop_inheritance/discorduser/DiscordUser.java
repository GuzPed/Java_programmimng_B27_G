package day39_oop_inheritance.discorduser;

public class DiscordUser {
    /*
    Create an DiscordUser class

    - create variables:
        role, name, id

    - create constructor to initialize the variables

    - create a toString() method
     */

    String role;
    String name;
    int id;

    public DiscordUser(String role, String name, int id) {
        this.role = role;
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "DiscordUser{" +
                "role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
