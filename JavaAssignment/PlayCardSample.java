import java.util.Collections;
import java.util.ArrayList;

public class PlayCardSample {
    public static void main(String[] args) {

        // Create a deck of 52 cards using ArrayList
        ArrayList<String> deck = new ArrayList<String>();
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " of " + suit);
            }
        }

        // Shuffle the deck
        Collections.shuffle(deck);

        // Deal the cards
        int userScore = 0;
        int computerScore = 0;
        boolean userBoom = false;
        boolean computerBoom = false;

        // Deal the first card to the computer
        String computerCard1 = deck.remove(deck.size() - 1);
        int computerValue1 = getValue(computerCard1);
        computerScore += computerValue1;
        System.out.println("The computer's first card is " + computerCard1);

        // Deal one card to user
        String userCard1 = deck.remove(deck.size() - 1);
        int userValue1 = getValue(userCard1);
        userScore += userValue1;
        System.out.println("Your first card is " + userCard1);

        // Deal one card to computer
        String computerCard2 = deck.remove(deck.size() - 1);
        int computerValue2 = getValue(computerCard2);
        computerScore += computerValue2;
        System.out.println("The computer's second card is " + computerCard2);

        // Deal one card to user again
        String userCard2 = deck.remove(deck.size() - 1);
        int userValue2 = getValue(userCard2);
        userScore += userValue2;
        System.out.println("Your second card is " + userCard2);

        // Check for 8 or 9
        if (userScore == 8 || userScore == 9 || userValue1 == 8 || userValue1 == 9 || userValue2 == 8
                || userValue2 == 9) {
            System.out.println("You Win!!");
            userBoom = true;
        }
        if (computerScore == 8 || computerScore == 9 || computerValue1 == 8 || computerValue1 == 9
                || computerValue2 == 8 || computerValue2 == 9) {
            System.out.println("Computer Win!!");
            computerBoom = true;
        }

        // Continue playing until someone wins
        while (!userBoom && !computerBoom) {
            if (computerScore < 4) {
                int lastCardIndex = deck.size() - 1;
                String lastCard = deck.get(lastCardIndex);
                int lastCardValue = getValue(lastCard);
                computerScore += lastCardValue;
                System.out.println("The computer's third card is " + lastCard);
            } else if (computerScore == 4) {
                int randomNumber = (int) (Math.random() * 10);
                if (randomNumber < 8) {
                    int lastCardIndex = deck.size() - 1;
                    String lastCard = deck.get(lastCardIndex);
                    int lastCardValue = getValue(lastCard);
                    computerScore += lastCardValue;
                    System.out.println("The computer's third card is " + lastCard);
                } else {
                    System.out.println("The computer does not pull a third card");
                }
            } else if (computerScore == 5) {
                int randomNumber = (int) (Math.random() * 10);
                if (randomNumber < 4) {
                    int lastCardIndex = deck.size() - 1;
                    String lastCard = deck.get(lastCardIndex);
                    int lastCardValue = getValue(lastCard);
                    computerScore += lastCardValue;
                    System.out.println("The computer's third card is " + lastCard);
                } else {
                    System.out.println("The computer does not pull a third card");
                }
            } else if (computerScore == 6) {
                int randomNumber = (int) (Math.random() * 10);
                if (randomNumber == 0) {
                    int lastCardIndex = deck.size() - 1;
                    String lastCard = deck.get(lastCardIndex);
                    int lastCardValue = getValue(lastCard);
                    computerScore += lastCardValue;
                    System.out.println("The computer's third card is " + lastCard);
                } else {
                    System.out.println("The computer does not pull a third card");
                }
            } else {
                System.out.println("The computer does not pull a third card");
            }

            // Determine if someone has won
            if (userScore > computerScore) {
                System.out.println("You win!");
                break;
            } else if (userScore < computerScore) {
                System.out.println("The computer wins!");
                break;

            } else {
                System.out.println("It's a tie! The game continues...");
            }
        }
    }

    public static int getValue(String card) {
        String[] parts = card.split(" ");
        String rank = parts[0];
        if (rank.equals("Jack") || rank.equals("Queen") || rank.equals("King")) {
            return 10;
        } else if (rank.equals("Ace")) {
            return 1;
        } else {
            return Integer.parseInt(rank);
        }
    }
}