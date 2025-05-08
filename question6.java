class Car{
    public void start(){
        System.out.println("The car has started");
    }
    public void drive(int distance){
        System.out.println("The car has Driven " + distance +"km.");
    }
}



class lab6{
    public static void main(String[] args) {
        Car obj = new Car();
        obj.start();
        obj.drive(20);
    }
}