public class Student{
    int id;
    String name;
    int age;
    String branch;
    double marks;
    Student(int id, String name, int age, String branch, double marks){
        this.id=id;
        this.name=name;
        this.age=age;
        this.branch=branch;
        this.marks=marks;
    }
    void display(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Branch: "+branch);
        System.out.println("Marks: "+marks);
        System.out.println("***********************************************");

    }
    public static void main(String[] args){
        Student[] obj=new Student[100];
        obj[0]=new Student(100,"Tony Stark",45,"Artificial Intelligence",90.23);
        obj[1]=new Student(101,"Thor",28,"Electrical Communication",75.63);
        obj[2]=new Student(102,"Hulk",40,"Data Science",84.65);
        obj[0].display();
        obj[1].display();
        obj[2].display();
    }
}