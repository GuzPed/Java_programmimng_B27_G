package day42_exceptions_abstraction.exercise;

public class Runner extends Exercise {

    @Override
    public void perform(){
        System.out.println("we are running");
    }

    @Override
    public void getCaloriesBurned(int minutes){
        System.out.println(minutes*0.35);
    }



}
