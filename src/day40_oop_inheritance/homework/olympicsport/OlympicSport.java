package day40_oop_inheritance.homework.olympicsport;

public class OlympicSport {
    /*
    Create a class OlympicSport
	instance variables
		- name (String)
		- participants (int)
	constructor:
		- initialize all fields
	methods:
		- compete(), toString()
		override compete in sub classes
     */
    String name;
    int participants;

    public OlympicSport(String name, int participants){
        this.name = name;
        this.participants = participants;
    }

    public String toString(){
        return name + " q-ty of participants " + participants;
    }

    public String complete(){
        return "";
    }

}
