package day40_oop_inheritance.homework.olympicsport;

public class Soccer extends OlympicSport {
    /*
    Create a class Soccer
	child class of OlympicSport
	constructor: set name and participants variables
	methods:
		compete(): Print Playing a soccer game
     */

    public Soccer(int participants) {
        super("Soccer", participants);
    }

    @Override
    public String complete() {
        return "Playing a soccer game";
    }
}
