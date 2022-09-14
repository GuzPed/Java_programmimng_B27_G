package day38_oop_encapsulation.traffic;

public class Driving {
    public static void main(String[] args) {

        TrafficLight road1 = new TrafficLight(("red"));
        System.out.println(road1.getColor()); //road1.color is not valid

        road1.setColor("blue");
        System.out.println(road1.getColor());

        road1.setColor("green");
        System.out.println(road1.getColor());

        TrafficLight road2 = new TrafficLight(("blue"));// because we can't assign something different than green, red, yellow
        System.out.println(road2.getColor());

        road2.setColor("yellow");
        System.out.println(road2.getColor());

    }
}
