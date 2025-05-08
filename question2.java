
import java.util.Scanner;

class date{
    int year;
    int month;
    int day;
     public void readDate(Scanner sc){
        System.out.print("Enter the Year : ");
        year = sc.nextInt();
        System.out.print("Enter the Month : " );
        month = sc.nextInt();
        System.out.print("Enter the day : ");
        day = sc.nextInt();
     }

     public void showDate(){
        System.out.println(year+ "/" + month+ "/" + day);
     }

}

class employee{
    String name;
    int id;
    int salary;
    date dob;
    employee(){
        dob = new date();
    }
    public void readDetails(Scanner sc){
        System.out.print("Enter the Name : ");
        name = sc.nextLine();
        System.out.print("Enter the salary : " );
        salary = sc.nextInt();
        System.out.print("Enter the id : ");
        id = sc.nextInt();
        dob.readDate(sc);
     }
     public void showDetails(){
        System.out.println();
        System.out.println("Here is Your Details : ");
        System.out.println("Please confirm it!!");
         System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Name : " + salary);
        System.out.print("Date of birth : ");
        dob.showDate();
     }

}

class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        employee mth = new employee();
        mth.readDetails(sc);
        mth.showDetails();

        
    }
}
