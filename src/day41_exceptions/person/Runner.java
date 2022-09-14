package day41_exceptions.person;

public class Runner {
    public static void main(String[] args) {

        Person obj1 = new Person();
        obj1.setName("James");
        obj1.setAge(21);
        System.out.println(obj1);

        Person obj2 = new Person();
        obj2.setAge(-30);
        System.out.println(obj2);
    }
}