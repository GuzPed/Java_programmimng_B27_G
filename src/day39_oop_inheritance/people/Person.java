package day39_oop_inheritance.people;

public class Person {

    String name;
    int age;

    public Person(){

    }

    public Person(String name, int age) {
        // super(); //calls the parent constructor (parent ->Object class)
        this.name = name;
        this.age = age;
    }
}
