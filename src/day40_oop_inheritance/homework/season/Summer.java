package day40_oop_inheritance.homework.season;

public class Summer extends Season{
    /*
    Create a class Summer
	child class of Season
	constructor: set values to variables
methods:
		activity(): Drink Lemonade
     */

    public Summer( double highestAvgTemp, double lowestAvgTemp) {
        super("Summer", highestAvgTemp, lowestAvgTemp);
    }

    @Override
    public String activity() {
        return " drink lemonade";
    }
}
