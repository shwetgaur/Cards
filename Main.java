// Main.java
// This is the main class containing the menu-driven program.
package assignment4;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        int choice;
        
        do {
            System.out.println("\n--- Card Deck Menu ---");
            System.out.println("1. Create Deck");
            System.out.println("2. Print Deck");
            System.out.println("3. Print Specific Card");
            System.out.println("4. Check if Two Cards are from Same Suit");
            System.out.println("5. Compare Two Cards by Rank");
            System.out.println("6. Find a Card in Deck");
            System.out.println("7. Deal 5 Random Cards");
            System.out.println("8. Shuffle Deck");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    deck.createDeck();
                    System.out.println("Deck created.");
                    break;
                case 2:
                    deck.printDeck();
                    break;
                case 3:
                    deck.printCard();
                    break;
                case 4:
                    deck.sameCard();
                    break;
                case 5:
                    deck.compareCard();
                    break;
                case 6:
                    deck.findCard();
                    break;
                case 7:
                    deck.dealCard();
                    break;
                case 8:
                    deck.shuffleDeck();
                    break;
                case 9:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 9);
        
        scanner.close();
    }
}
