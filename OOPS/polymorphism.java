package OOPS;

public class polymorphism {
    public static void main(String[] args) {
        Goat ronaldo = new Goat();
        ronaldo.eat();  //eats grass
    }
}

//function overloading(same function with diffrent attributes)

class Calulator{
 
    int sum(int a ,  int b){
        return a+b ; 
    }

    float sum(float a , float b ){
        return a+b;
    }
}

//function overriding(parent class function is been overwritten by child class function)

//parent
class Animal{
    void eat(){
        System.out.println("Eat");
    }
}

class Goat extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}
