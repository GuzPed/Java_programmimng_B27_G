package day42_exceptions_abstraction.exercise;

public class Gym {

    public static void main(String[] args) {
      //  Exercise obj = new Exercise(); is not valid, because it is abstract, we can't create O

        Runner run = new Runner();
        run.perform();
        run.getCaloriesBurned(30);


        //Lifting obj = new Lifting() ; is abstract - we cannot create an object of this class

        Bench benching = new Bench();
        benching.perform();
        benching.getCaloriesBurned(20);
        benching.rackWeights();


    }

}
