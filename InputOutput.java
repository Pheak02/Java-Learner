import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        // 1.user input

        System.out.println("What is your name?");
        // 2. Get input from user

        // type identifer = new type();
        Scanner scanner = new Scanner(System.in);
        // 3. returns a line of text that is read from the scanner object as string

        // scanner is the name of the var=identifer
        // Scanner is the type.
        String name = scanner.nextLine();
        // output
        System.out.println("Hello " + name);
    }
}