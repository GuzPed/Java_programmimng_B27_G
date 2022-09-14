package day40_oop_inheritance;

public  class FinalExamples  {

    public final int a = 10; // hardcoded instance variables
    public final int b;  // it has to have a value, otherwise it gives an error, hardcoded or constructor

    public static final String PLANET = "Earth";  // public static final makes this variable Constant

    public FinalExamples(int num){
        b=num; // when the projects created , the giveb argument will be the value of b, then it cannot be changed
    }


}


