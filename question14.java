// Interface
interface Engine {
    void startEngine();
    void stopEngine();
}

// Abstract Class
abstract class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    // Abstract method
    abstract void drive();

    // Concrete method
    void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

// Concrete Class
class Car extends Vehicle implements Engine {

    Car(String brand) {
        super(brand);
    }

    // Implement abstract method from Vehicle
    @Override
    void drive() {
        System.out.println("Car is driving...");
    }

    // Implement methods from Engine interface
    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped.");
    }
}

// Main class to run the program
 class question14 {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota");
        myCar.displayBrand();
        myCar.startEngine();
        myCar.drive();
        myCar.stopEngine();
    }
}
