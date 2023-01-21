import java.util.Scanner;

public class Foundation { // Foundation is the name of the class
    public static void main(String[] args) { // main is the name of the fucntion
        System.out.println("What is your name?");// statement - member of the method
        // access member by using .out.
        // System.out.println("Hello" + args[0]);// pass the argument that the user can
        // type.
        // args[0]​​​ refers to index 0 of the array that we add on to the statement.

        // type identifer = new type();
        Scanner scanner = new Scanner(System.in);
        // scanner is the name of the var=identifer
        // Scanner is the type.
        String name = scanner.nextLine();
        System.out.println("Hello " + scanner);
    }

}