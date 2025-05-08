

class lab9{
     private class Car {
          String make;
          String model;
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
      public void accesscar(){
          Car obj1 = new Car();
          obj1.setString("BMW", "R9");
          obj1.setInt(2002);
          obj1.getter();
         }
public static void main(String[] args) {
    
    lab9 obj = new lab9();
    obj.accesscar();

}
}


