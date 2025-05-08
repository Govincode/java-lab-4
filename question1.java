import java.util.Scanner;

class Student{
    String name;
    int roll;
    double marks;
    String remarks;

    public void show(){
       
            System.out.println(name + " roll: "+roll+ " marks : " + marks + " Remarks : " + remarks);
       
    }

    public void readData(Scanner sc){
            System.out.print("Enter student name : ");
            name = sc.nextLine();
            System.out.print("Enter student roll : ");
            roll = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter student marks : ");
            marks = sc.nextDouble();
            sc.nextLine();
            System.out.print("Enter student remarks : ");
            remarks = sc.nextLine();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Student student1 = new Student();
        Student student2 = new Student();
       
        Student arr[] = new Student[4];
        arr[0] = student1; 
        arr[1] = student2;
        
        try{

            for(int i = 0;i<arr.length;i++){
                arr[i].readData(sc);
                arr[i].show();
            }
        }catch(java.lang.NullPointerException e){
            System.out.println("Program Finished!!");
        }
        sc.close();
    }
}