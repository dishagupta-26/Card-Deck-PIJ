// Name: Disha Deepak Gupta
// PRN: 24070126513
// Batch: A2

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();

        while (true) {
            // display menu
            System.out.println("\nMenu:");
            System.out.println("1. Print deck");
            System.out.println("2. Shuffle deck");
            System.out.println("3. Deal 5 cards");
            System.out.println("4. Find a card");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    deck.printDeck();
                    break;
                case 2:
                    deck.shuffleDeck();
                    break;
                case 3:
                    deck.dealCards();
                    break;
                case 4:
                    System.out.print("Enter suit: ");
                    String suit = scanner.next();
                    System.out.print("Enter rank: ");
                    String rank = scanner.next();
                    deck.findCard(suit, rank);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
