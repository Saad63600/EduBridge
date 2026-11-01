class Animal{
    String name;
    Animal(String name){
        this.name=name;
    }
    void eat(){
        System.out.println(name+" eats foold");
    }
}
class Dog extends Animal{
    String breed;
    Dog(String name,String breed){
        super(name);
        this.breed=breed;
    }
    void bark(){
        System.out.println(name+" barks");
    }
    void display(){
        System.out.println("Name: "+super.name);
        System.out.println("Breed: "+breed);
        super.eat();
        bark();
    }
}
public class Animals{
    public static void main(String[] args){
        Dog d=new Dog("Tommy","Labrador");
        d.display();
    }
}