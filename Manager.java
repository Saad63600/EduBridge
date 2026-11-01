class Person {
    String name;
    Person(String name){
        this.name=name;
    }
    void displayPerson(){
        System.out.println("Name: "+name);
    }
}
class Employee extends Person{
    int employeeId;
    Employee(String name, int employeeId){
        super(name);
        this.employeeId=employeeId;
    }
    void displayEmployee(){
        System.out.println("Employee Id: "+employeeId);
    }
}
class Manager extends Employee{
    String department;
    Manager(String name, int employeeId, String department){
        super(name,employeeId);
        this.department=department;
    }
    void displayManager(){
        System.out.println("Department: "+department);
    }
    public static void main(String[] args){
        Manager m=new Manager("Priya", 101, "IT");
        m.displayPerson();
        m.displayEmployee();
        m.displayManager();
    }
}

