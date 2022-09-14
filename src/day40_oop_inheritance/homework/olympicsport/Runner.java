package day40_oop_inheritance.homework.olympicsport;

public class Runner {

    public static void main(String[] args) {

        Soccer soccer = new Soccer(25);
        System.out.println(soccer);
        System.out.println(soccer.complete());

        Track track = new Track(15);
        System.out.println(track);
        System.out.println(track.complete());

        Surfing surfing = new Surfing(1);
        System.out.println(surfing);
        System.out.println(surfing.complete());


    }


}
