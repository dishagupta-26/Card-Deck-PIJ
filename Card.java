public class Card {
    private String suit;
    private String rank;

    // constructor
    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // getters and setters
    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    // print card details
    public void printCard() {
        System.out.println(rank + " of " + suit);
    }
}