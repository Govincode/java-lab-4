 
 class Student {
    private String name;
    private int age;
    private String batch;

   //Setter method
   public void setter(String name, String batch,int age){
        this.name = name;
        this.batch = batch;
        this.age = age;
        
   }
  
   //Getter method
   public void getter(){
    System.out.println("Make : " + this.name);
    System.out.println("Model : " + this.batch);
    System.out.println("Year : " + this.age);
   }

   
}
public class Main{
    public static void main(String[] args) {
    
    Student obj = new Student();
    obj.setter("govinda", "2019",21);
    obj.getter();

    }
}


