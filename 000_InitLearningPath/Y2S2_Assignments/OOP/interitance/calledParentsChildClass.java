package OOP.interitance;

class calledParentsChildClass {
    calledParentsChildClass() {
        System.out.println("Parent Constructor is called");
    }
}

class ChildClass extends calledParentsChildClass {
    ChildClass() {
        System.out.println("Child Constructor is called");
    }
}

class Program {
    public static void main(String[] args) {
        ChildClass child1 = new ChildClass();
    }
}