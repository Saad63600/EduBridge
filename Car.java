class Vehicle {
    Vehicle(){
        System.out.println("Vehicle Constructor");
    }
}
class Car extends Vehicle{
    Car(){
        super();
        System.out.println("Car Constructor");
    }
    public static void main(String[] args){
        Car c=new Car();
    }
}