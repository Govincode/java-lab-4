
import java.util.Arrays;
import java.util.Scanner;

class Employee{
    String name;
    String address;
    double salary;
    int id;

    Employee(String name, String address, Double salary , int id){
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.id = id;

    }

    public void display(){
        System.out.println("Top Paid Employees : ");
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
        System.out.println("Salary : " + salary);
        System.out.println("Id : " + id);
    }
}




class lab3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee employee[] = new Employee[5];

        for(int i = 0; i<5; i++){
            System.out.print("Enter Name of " + (i+1) + " Employee : ");
            String name = sc.nextLine();
            System.out.print("Enter Address of " + (i+1) + " Employee : ");
            String address = sc.nextLine();
            System.out.print("Enter salary of " + (i+1) + " Employee : ");
            double salary =  sc.nextDouble();
            sc.nextLine();
            System.out.print("Enter id of " + (i+1) + " Employee : ");
            int id = sc.nextInt();
            sc.nextLine();
            employee[i] = new Employee(name,address,salary,id);
            System.out.println();
        }

       Arrays.sort(employee,(e1,e2)-> Double.compare(e1.salary, e2.salary));

       for(int i = 0;i<3;i++){
            employee[i].display();
       }

       sc.close();
    }
}
