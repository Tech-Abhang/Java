package OOPS;

public class abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();   //four legs

        //cannot create abstact classes object
        // Animal a = new Animal()   error  
    }
}

abstract class Animal{
    String color ; 

    void eat(){
        System.out.println("eats");
    }

    //we can create constructors which helps for default values for every child class
    Animal(){
        color = "brown" ; 
    }

    //abstraction
    abstract void walk();
}

class Horse extends Animal{

    void walk(){
        System.out.println("four legs");
    }
}
