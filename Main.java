class Person {
    String name;
    Person(String name){
        this.name=name;
    }
}
class Student extends Person{
    int rollno;
    Student(String name, int rollno){
        super(name);
        this.rollno=rollno;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll Number: "+rollno);
    }
}
public class Main{
    public static void main(String[] args){
        Student s=new Student("Rahul", 101);
        s.display();
    }
}
