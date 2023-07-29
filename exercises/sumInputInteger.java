package exercises;

import java.util.Scanner;

public class sumInputInteger {
    public static void main(String[] args) {

        int total = 0;
        for (int i = 0; i <= 50; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter a number ");
            int userInput = scan.nextInt();
            total += userInput;
            if (total > 50) {
                System.out.println("Your total number must less than or equal to 50 only!");
                break;
            }
            System.out.println("Your total is: " + total);

        }
    }
}
