class Car{
    public void start(){
        System.out.println("The car has started");
    }
    public void drive(int distance){
        System.out.println("The car has Driven " + distance +"km.");
    }
}

class ElectricCar extends Car{
    public void drive(int distance){
        System.out.println("The Electric car has Driven " + distance +"km.");
    }
}



class lab8{
    public static void main(String[] args) {

        System.out.println("Normal car");
        Car obj = new Car();
        obj.start();
        obj.drive(20);

        System.out.println("Electric car");

        obj = new ElectricCar();
        obj.start();
        obj.drive(10);


    }
}