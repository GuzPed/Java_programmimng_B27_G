package day41_exceptions.hiding;

public class Person {
    String name = " James Bond";
}


class SecretIdentity extends Person{
    String name = "dnobsemaj"; //doing variable hidhing, the original one, is hidden, but now i have a new variable with the same name
}

class Runner {
    public static void main(String[] args) {
        System.out.println(new Person().name);
        System.out.println(new SecretIdentity().name);

    }
}