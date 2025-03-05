import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    // list to store all the cards
    private ArrayList<Card> cards;

    // constructor
    public Deck() {
        createDeck();
    }

    // create a deck of 52 cards
    public void createDeck() {
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
        cards = new ArrayList<>();

        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank));
            }
        }
    }
}
