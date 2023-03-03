import java.util.Scanner;
import java.util.Vector;
import java.util.Random;

class Card {
    private int rank;
    private int suit;

    public Card() {
        this.rank = 0;
        this.suit = 0;
    }

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }
    //constructor overloading
    public int getRank() {
        return rank;
    } //getter method for Rank

    public int getSuit() {
        return suit;
    }//getter method for Suit

    public void printCard() {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        System.out.println(ranks[this.rank] + " of " + suits[this.suit]);
    }//printing Card

    public static Vector<Card> createDeck() {
        Vector<Card> deck = new Vector<Card>();
        for (int suit = 0; suit < 4; suit++) {
            for (int rank = 0; rank < 13; rank++) {
                deck.add(new Card(rank, suit));
            }
        }
        return deck;
    }

    public static void printDeck(Vector<Card> deck) {
        for (Card card : deck) {
            card.printCard();
        }
    }

    public boolean sameCard(Card other) {
        return (this.rank == other.rank && this.suit == other.suit);
    }

    public int compareCard(Card other) {
        if (this.rank < other.rank) {
            return -1;
        } else if (this.rank > other.rank) {
            return 1;
        } else {
            if (this.suit < other.suit) {
                return -1;
            } else if (this.suit > other.suit) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public static void sortDeck(Vector<Card> deck) {

        deck.sort(Card::compareCard);
    }

    public static void findCard(Vector<Card> deck, Card card) {
        for (int i = 0; i < deck.size(); i++) {
            if (deck.get(i).sameCard(card)) {
                System.out.println("Card found at index " + i);
                return;
            }
        }
        System.out.println("Card not found");
    }
    public static void dealCards(Vector<Card> deck, int numCards) {
        Random rand = new Random();
        for (int i = 0; i < numCards; i++) {
            int index = rand.nextInt(deck.size());
            Card card = deck.get(index);
            card.printCard();
            deck.remove(index);
        }
    }
}
