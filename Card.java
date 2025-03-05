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

    // check if two cards belong to the same suit
    public boolean sameSuit(Card other) {
        return this.suit.equals(other.suit);
    }

    // check if two cards belong to the same rank
    public boolean sameRank(Card other) {
        return this.rank.equals(other.rank);
    }
}