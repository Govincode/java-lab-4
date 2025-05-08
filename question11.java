class Person{
    String name;
    int age;
    public Person(){
        name = null;
        age = 0;
    }

    public Person(String name, int age){
       String n =  this.name = name;
       int a =  this.age = age;

       System.out.println("Name : " + n);
       System.out.println("Age : " + a);
    }
}

class lab11{
    public static void main(String[] args) {
        Person obj = new Person("Govinda",20);

    }
}