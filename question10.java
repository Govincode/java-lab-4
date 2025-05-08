import java.util.Scanner;

class student{
    double Java;
    double C;
    double Math;
    double DSA;
    double DBMS;

    public void takeInput( Scanner sc){
        System.out.print("Enter the marks of JAVA : ");
        Java = sc.nextDouble();
        System.out.print("Enter the marks of C : ");
        C = sc.nextDouble();
        System.out.print("Enter the marks of Math : ");
        Math = sc.nextDouble();
        System.out.print("Enter the marks of DSA : ");
        DSA = sc.nextDouble();
        System.out.print("Enter the marks of DBMS : ");
        DBMS = sc.nextDouble();
        checker();
    }

    public void checker(){
        double total = Java + C + Math + DSA + DBMS;
        double percentage = (total * 500) / 100;

        if(Java >= 40 && C >= 40 && Math >= 40 && DSA >= 40 && DBMS >= 40){
            System.out.println("Student is Passed");
            System.out.println("Total : " + total);
            System.out.println("Percentage : " + percentage);
        }else{
            System.out.println("Student is failed");
        }
    }

}


class lab10{
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        student obj = new student();
        obj.takeInput(sc);

    }
}