package day40_oop_inheritance.homework.season;

public class Spring extends Season{
    /*
    Create a class Spring

	child class of Season

	constructor: set values to variables

	methods:
		activity(): Go Outside
     */

    public Spring( double highestAvgTemp, double lowestAvgTemp) {
        super("Spring", highestAvgTemp, lowestAvgTemp);
    }

    @Override
    public String activity() {
        return "go outside";
    }
}
