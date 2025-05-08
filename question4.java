import java.util.Scanner;

class Student{
    int physics;
    int chemistry;
    int mathematics;

    public void readMarks(Student[] arr, Scanner sc){
        for(int i = 0;i<arr.length;i++){
            System.out.print("Enter chemistry marks of " +(i+1)+" student : ");
            arr[i].chemistry = sc.nextInt();
            System.out.print("Enter chemistry marks of " +(i+1)+" student : ");
            arr[i].physics = sc.nextInt();
            System.out.print("Enter chemistry marks of " +(i+1)+" student : ");
            arr[i].mathematics = sc.nextInt();
        }
    }

    public void showTotal(Student[] arr){
        for(int i = 0;i<arr.length;i++){
            int temp[] = new int[3];
            temp[i] = arr[i].mathematics + arr[i].physics+arr[i].chemistry;
            System.out.println("Total Marks of " + (i+1) + " student : " + temp[i]);
            
        }
    }

}



class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();

        Student arr [] = new Student[3];
        arr[0] = st1;
        arr[1] = st2;
        arr[2] = st3;

        Student mth = new Student();
        mth.readMarks(arr, sc);
        mth.showTotal(arr);
        sc.close();
    }
}