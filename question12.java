 
 class Car {
    private String make;
    private String model;
    int year;

   //Setter method
   public void setString(String make, String model){
        this.make = make;
        this.model = model;
        
   }
   public void setInt(int year){
        this.year = year;
   }

   //Getter method
   public void getter(){
    System.out.println("Make : " + this.make);
    System.out.println("Model : " + this.model);
    System.out.println("Year : " + this.year);
   }

   
}
class lab12{
public static void main(String[] args) {
    
    Car obj = new Car();
    obj.setString("BMW", "R9");
    obj.setInt(1999);

    obj.getter();

}
}


