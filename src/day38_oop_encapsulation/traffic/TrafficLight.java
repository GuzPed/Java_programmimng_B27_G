package day38_oop_encapsulation.traffic;

public class TrafficLight {
    private String color;



    public TrafficLight(String color){
        setColor(color);

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color.equalsIgnoreCase("green") || color.equalsIgnoreCase("red") || color.equalsIgnoreCase("yellow")){
            this.color = color;
        } // if this boolean false(not valid color, then nothing is assigned to the color variable)
    }
}
