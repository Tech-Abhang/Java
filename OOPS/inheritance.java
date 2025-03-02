package OOPS;

public class inheritance {
    public static void main(String[] args) {
        
    }
}

//base class / parent class
class Animal {
    String color ; 

    void eat(){
        System.out.println("Eat");
    }

    void breath(){
        System.out.println("breath");
    }
}

//single level inheritance
class Mammals extends Animal{
    int legs ; 

    void breed(){
        System.out.println("breed");
    }
}

//multi-level inheritnce
class Fish extends Mammals{
    int fins ; 

    void swim(){
        System.out.println("Swim");
    }
}

//hierarchical 
class Bird extends Mammals{
    void fly(){
        System.out.println("fly");
    }
}