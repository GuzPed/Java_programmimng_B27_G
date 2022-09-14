package day40_oop_inheritance;

public class Rules {

}

class A{
    public int getNum(){
        return 5;
    }

    String getName(){ //default access
        return "James";
    }

    public A get(){ // A is the return type, the method should return an A object
        return new A();
    }

}

class B extends A{
    @Override  // cannot change name or parameters
    public int getNum(){
        return 5;
    }
}

class C extends A{
    @Override  // we are able to change the access modifier to more accessible if we want
   protected String getName(){
        return "James";
    }
}

class D extends A{
    @Override // you can keep the return type the same, or to covariant : sub class of that return type
    public D get(){
        return null;
    }

}