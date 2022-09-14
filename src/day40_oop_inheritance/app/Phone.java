package day40_oop_inheritance.app;

public class Phone {
    public static void main(String[] args) {

        Youtube youtube = new Youtube (4.8);
        System.out.println(youtube.name);
        System.out.println(youtube.version);

        youtube.watchVideo();
        youtube.download();

        System.out.println(youtube); // youtube has toString from Object class, but it will give a hashcode, unless we create our own toString (overrriding)

    }
}
