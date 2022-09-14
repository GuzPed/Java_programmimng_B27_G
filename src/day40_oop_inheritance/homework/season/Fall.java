package day40_oop_inheritance.homework.season;

public class Fall extends Season{
    /*
    Create a class Fall
	child class of Season
	constructor: set values to variables
	methods:
		activity(): Read A Book
     */

    public Fall( double highestAvgTemp, double lowestAvgTemp) {
        super("Fall", highestAvgTemp, lowestAvgTemp);
    }

    @Override
    public String activity() {
        return " read a book";
    }
}
