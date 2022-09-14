package day40_oop_inheritance.homework.olympicsport;

public class Surfing extends OlympicSport {
    /*
    Create a class Surfing
	child class of OlympicSport
	constructor: set name and participants variables
	methods:
		compete(): Print Surfing the waves
     */

    public Surfing( int participants) {
        super("Surfing", participants);
    }

    @Override
    public String complete() {
        return "Surfing the waves";
    }
}
