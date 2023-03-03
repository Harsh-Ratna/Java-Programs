import java.util.Scanner;
import java.util.Vector;

public class CardGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Vector<Card> deck = Card.createDeck();
        menuloop:
        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Print the deck");
            System.out.println("2. Check if two cards are the same");
            System.out.println("3. Sort the deck");
            System.out.println("4. Find a card");
            System.out.println("5. Deal cards");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");
            int choice = input.nextInt();
            switch(choice){
                case(1):
                    System.out.println("\n--- Deck ---");
                    Card.printDeck(deck);
                    break;
                case(2):
                    System.out.println("\nEnter the first card:");
                    Card card1 = readCard(input);
                    System.out.println("Enter the second card:");
                    Card card2 = readCard(input);
                    if (card1.sameCard(card2)) {
                        System.out.println("The two cards are the same");
                    } else
                        System.out.println("The two cards are different");
                    break;
                case(3):
                    Card.sortDeck(deck);
                    System.out.println("\n--- Sorted deck ---");
                    Card.printDeck(deck);
                    break;
                case(4):
                    System.out.println("\nEnter a card to search for:");
                    Card card = readCard(input);
                    Card.findCard(deck, card);
                    break;
                case(5):
                    System.out.println("\nDealing cards...");
                    Card.dealCards(deck, 5);
                    break;
                case(6):
                    System.out.println("Thank you for playing!");
                    break menuloop;
            }
        }
    }
    public static Card readCard(Scanner input) {
        System.out.print("Enter rank (0-12): ");
        int rank = input.nextInt();
        System.out.print("Enter suit (0-3): ");
        int suit = input.nextInt();
        return new Card(rank, suit);
    }
}
