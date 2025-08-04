
//import statement
import java.util.Scanner;

//class of exercise6
public class Exercise6 {
    // main function
    public static void main(String[] args) {
        // declare and initialize the required var
        int countPositive = 0, countNegative = 0;
        int counter = 0, sum = 0, integer;
        // declare the input scanner
        Scanner in = new Scanner(System.in);
        // print the instruction
        System.out.print("Enter many integer as you want, the input ends if it is  0");
        // read the integer value from user
        integer = in.nextInt();
        // using while loop, check the integer
        // using while loop, check the integer
        while (integer != 0) {
            if (integer > 0)
                countPositive++;
            else if (integer < 0)
                countNegative++;
            sum += integer;
            counter++;
            // read the next integer
            integer = in.nextInt();
        }
        // check if the counter 0
        if (counter == 0)
            System.out.println("You just enter 0");
        else {
            System.out.println("the number of positive is" + countPositive);
            System.out.println("the number of negative is" + countNegative);
            // print the sum
            System.out.println("The total is" + sum);
        }

    }
}
