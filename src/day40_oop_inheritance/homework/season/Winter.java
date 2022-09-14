package day40_oop_inheritance.homework.season;

public class Winter extends Season {
    /*
    Create a class Winter
	child class of Season
	constructor: set values to variables
	methods:
		activity(): Print Use Fireplace
     */

    public Winter(double highestAvgTemp, double lowestAvgTemp) {
        super("Winter", highestAvgTemp, lowestAvgTemp);
    }

    @Override
    public String activity() {
        return "use fireplace";
    }

}
