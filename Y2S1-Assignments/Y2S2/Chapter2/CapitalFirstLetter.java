import java.util.Scanner;

public class CapitalFirstLetter {
  public static String capitalize(String inputString) {// get the first character of the inputString
    char firstLetter = inputString.charAt(0); // charAt() function returns the character at a given position in a
                                              // string.

    // convert it to an UpperCase letter
    char capitalFirstLetter = Character.toUpperCase(firstLetter); // specify with firstletter

    // return the output string by updating
    // the first char of the input string
    return inputString.replace(inputString.charAt(0), capitalFirstLetter);

  }

  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in); // Create a Scanner object
    System.out.println("Enter a sentence:");
    String sentence = myObj.nextLine(); // Read user input
    sentence.split("");
    System.out.println("capitalize(sentence) = " + capitalize(sentence) + "\n"); // Output user input
  }
}