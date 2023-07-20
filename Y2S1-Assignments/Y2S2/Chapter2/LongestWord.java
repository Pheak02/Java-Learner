import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { // define block of code
            System.out.println("Enter a sentence: "); // get user input
            String input_sentence = scanner.nextLine(); // read user input
            String[] words = input_sentence.split(" "); // to splite sentence in list of word
            String longest_word = ""; // to store the longest word
            int longest_word_len = 0; // len of longest word start from 0
            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                int len = word.length(); // length means method returns the length of a specified string
                if (len > longest_word_len) {
                    longest_word = word; // if longest word = any word that we splited
                    longest_word_len = len; // longest_word=word=len it it deternmin it returns the length of a
                                            // specified string by .length
                }
            }
            System.out.println(longest_word);
        }
    }
}

// longest Word Concept

// import java.util.Scanner;

// public class LongestNameConcept {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter a sentence: ");
// String a = sc.nextLine();
// a = a.trim();
// a = a + "";
// int l = a.length();
// int ll = 0; // to store the length of the longest word
// String b = "";// to store the words temporarily
// String f = "";// to store the longest word
// for (int i = 0; i < l; i++) {
// char c = a.charAt(i);
// if (c != ' ')
// b = b + c;
// else {
// int lt = b.length(); // to store to length of each word temporarily
// if (lt > 11) {
// ll = lt;
// f = b;
// }
// b = "";

// }
// }
// System.out.println("longest word: " + f + "With length:" + ll);
// }
// }