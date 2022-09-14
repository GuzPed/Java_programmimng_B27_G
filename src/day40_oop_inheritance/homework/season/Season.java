package day40_oop_inheritance.homework.season;

public class Season {
    /*
    Create a class Season
	instance variables
		- name (String)
		- highest average temperature
		- lowest average temperature
	constructor:
	- initialize all fields
	methods:
		- activity(), toString()
		override activity in sub classes
     */

    String name;
    double highestAvgTemp;
    double lowestAvgTemp;

    public Season(String name, double highestAvgTemp, double lowestAvgTemp) {
        this.name = name;
        this.highestAvgTemp = highestAvgTemp;
        this.lowestAvgTemp = lowestAvgTemp;
    }

    public String activity(){
        return "";
    }


    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", highestAvgTemp=" + highestAvgTemp +
                ", lowestAvgTemp=" + lowestAvgTemp +
                '}';
    }
}
