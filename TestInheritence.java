abstract class Vehicle{
protected String brand;
protected int year;
protected double price;
//concrete method
Vehicle(String brand, int year, double price){
this.brand =brand;
this.year =year;
this.price =price;
}
//concrete method
void displayInfo(){
System.out.println("Brand Name: "+brand);
System.out.println("Year Release: "+year);
}
abstract void move();// abstract method
}
class Car extends Vehicle {
private double speed;
Car(String brand, int year, double price, double speed){
super(brand, year, price);
this.speed= speed;
}
@Override
void displayInfo(){
super.displayInfo();

System.out.println("Car price: "+super.price);
}
@Override
public void move(){
System.out.println("Car is moving at :"+speed+" K/h");
}
}
class Bus extends Vehicle{
private double speed;
Bus(String brand, int year, double price, double speed){
super(brand, year, price);
this.speed= speed;
}
@Override
void displayInfo(){
super.displayInfo();
System.out.println("Bus price: "+super.price);
}
@Override
public void move(){
System.out.println("Bus is moving at: "+speed +" K/h");
}
}
public class TestInheritence{
public static void main(String[] args) {
Vehicle redCar= new Car("Tesla", 2025, 5000, 80 );// upcasting
redCar.displayInfo();
redCar.move();
System.out.println();
Vehicle redBus= new Bus("Hanif", 2010, 500, 40 ); // upcasting
redBus.displayInfo();
redBus.move();
}
} 