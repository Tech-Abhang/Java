package OOPS;

public class constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Abhang");
        System.out.println(s1.name);
    }

}

class Student {
    String name ; 
    int roll ;

    //constructor(if not created they are auto created by the class but we wont be able to give parameters)
    Student(String name){
        this.name = name;
    }
}
