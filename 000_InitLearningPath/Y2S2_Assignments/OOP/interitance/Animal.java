package OOP.interitance;

class Animal {
    String name;

    void eat() {
        System.out.println("The animal is eating");
    }
}

class Dog extends Animal { // inherit from Animal
    // new method in child class
    void display() {
        // access name field of the parent class
        System.out.println("Its name is" + name);
    }
}

class Program {
    public static void main(String[] args) {
        // create an object of the child class
        Dog dog1 = new Dog();
        // access parent class data field and method
        dog1.name = "Lucky";
        dog1.eat();
        // call child class method
        // dog1.display();
    }
}
