// Base class Fruit
class Fruit {
    String name;
    String taste;
    int size;

    // Constructor
    Fruit(String name, String taste, int size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    // Method to be overridden
    void eat() {
        System.out.println("The fruit is " + name + " and it tastes " + taste + ".");
    }
}


class Apple extends Fruit {

    Apple(String name, String taste, int size) {
        super(name, taste, size);
    }

    
   
    void eat() {
        System.out.println("Apple: " + name + ", Taste: " + taste + ", Size: " + size);
    }
}

// Derived class Orange
class Orange extends Fruit {

    Orange(String name, String taste, int size) {
        super(name, taste, size);
    }

   

    void eat() {
        System.out.println("Orange: " + name + ", Taste: " + taste + ", Size: " + size);
    }
}

// Main class to test the implementation
class lab16 {
    public static void main(String[] args) {
        Apple apple = new Apple("Red Apple", "Sweet", 5);
        Orange orange = new Orange("Navel Orange", "Citrusy", 4);

        apple.eat();  
        orange.eat();  
    }
}
