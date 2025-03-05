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

    // shuffle the deck randomly
    public void shuffleDeck() {
        Collections.shuffle(cards);
        System.out.println("Deck shuffled!");
    }

    // dealing 5 random cards from the deck
    public void dealCards() {
        Random random = new Random();
        System.out.println("Dealing 5 random cards:");
        for (int i = 0; i < 5; i++) {
            cards.get(random.nextInt(cards.size())).printCard();
        }
    }

    // searching for a specific card
    public void findCard(String suit, String rank) {
        for (Card card : cards) {
            if (card.findCard(suit, rank)) {
                System.out.println("Card found!");
                card.printCard();
                return;
            }
        }
        System.out.println("Card not found!");
    }
}
