package day41_exceptions.season;

public class Season {
    String name;
    double highestTemp;
    double lowestTemp;

    public Season(String name, double highestTemp, double lowestTemp) {
        this.name = name;
        this.highestTemp = highestTemp;
        this.lowestTemp = lowestTemp;
    }

    public void activity(){
        System.out.println("Generic season");
    }

    public String toString(){
        return name + " season with the highest tenperature of " + highestTemp + " and the lowest temperature " + lowestTemp;
    }



}
