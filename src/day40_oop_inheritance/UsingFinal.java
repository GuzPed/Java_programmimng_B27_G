package day40_oop_inheritance;

public class UsingFinal extends Test {
   // extends FinalExamples does not work, because FinalExample class is final
    // or extends String, Math

    public static void main(String[] args) {

        FinalExamples obj = new FinalExamples(20);
        System.out.println(obj.a);
        System.out.println(obj.b);

      //  obj.a = 4; cannot change final variables
      //  obj.b = 20;

        System.out.println(FinalExamples.PLANET);

        //FinalExamples.PLANET = "Mats";  cannlt change the constant

        Test obj2 = new Test();
        obj2.helloWorld();



    }
    //cannot override the final method
 //   @Override
 //   public void helloWorld(){
 //
  //  }

}
class Test{
    public final void helloWorld(){
        System.out.println("Hello World");
    }
}