package OOPS;

public class constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Abhang";
        s1.roll = 54;
        
    }

}

class Student {
    String name ; 
    int roll ;

    //constructor(if not created they are auto created by the class but we wont be able to give parameters)

    // T1-non-paramaterized contructor
    Student(){
        System.out.println("contructor is called");
    }

    // T2-paramaterized constructor
    Student(String name){
        this.name = name;
    }

    //copy constuctor
    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
    }

}
