package day40_oop_inheritance.homework.olympicsport;

public class Track extends OlympicSport{
    /*
    Create a class Track
	child class of OlympicSport
	constructor: set name and participants variables
methods:
		compete(): Print Track for running, jumping, throwing
     */

    public Track(int participants) {
        super("Track", participants);
    }

    @Override
    public String complete() {
        return "Track for running, jumping, throwing";
    }
}
