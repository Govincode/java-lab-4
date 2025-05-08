 
 class Car {
    String make;
    String model;
    private static int year;

    static{
        year = 2002;
    }
   
    public Car(String make, String model){
        System.out.println("Make : " + make);
        System.out.println("Model : " + model);
        System.out.println("Year : " + year);
    }

    
}
class lab7{
 public static void main(String[] args) {
     
     Car obj = new Car("BMW","R9");

    

 }
}


