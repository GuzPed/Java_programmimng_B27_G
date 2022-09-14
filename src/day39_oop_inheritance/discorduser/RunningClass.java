package day39_oop_inheritance.discorduser;

public class RunningClass {
    public static void main(String[] args) {

        Admin ad1 = new Admin("Admin", "Pedro", 56);
        ad1.createChanne();
        System.out.println(ad1);

        System.out.println(" ====================================");

        Student stu1 = new Student("student", "Mart", 4568);
        stu1.sendMessage();
        System.out.println(stu1.name);
        System.out.println();
        System.out.println(stu1);







    }
}
