class Car{
    public void start(){
        System.out.println("The car has started");
    }
    
}

class CarDistance extends car{
    public void drive(int distance){
        System.out.println("The car has Driven " + distance +"km.");
    }
}



class lab6{
    public static void main(String[] args) {
        Car obj = new Car();
        Car obj2 = new CarDistance();
        obj.start();
        obj2.drive(20);
    }
}
