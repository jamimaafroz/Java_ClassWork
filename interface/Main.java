interface Drivable {
    void drive(double speed);
}

class Bike implements Drivable {
    @Override
    public void drive(double speed) {
        System.out.println("The bike is moving at " + speed + "km/h.");
    }
}

public class Main {
    public static void main(String[] args) {
        Bike myBike = new Bike();
        myBike.drive(25.5);
    }
}