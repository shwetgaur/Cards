package assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Deck {
    private ArrayList<Cards> deck;
// ArrayList <Integer> variable= new
    public Deck() {
        deck = new ArrayList<>();
        createDeck();
        displayDeck();
        shuffleDeck();
        displayDeck();
    }

    public void createDeck() {
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suits = {"Clubs", "Diamonds", "Spades", "Hearts"};

        for (String suit : suits) {
            for (String r : rank) {
                deck.add(new Cards(suit, r));
            }
        }
    }

    public void displayDeck() {
        System.out.println("_________Deck_________");
        for (Cards card : deck) {
            System.out.println(card);
        }
    }

    public void shuffleDeck() {
        System.out.println("Shuffling deck");
        Collections.shuffle(deck);
    }

    public void selectTwoRandomCards() {
        shuffleDeck();
        System.out.println("Selected cards:");

        System.out.println("Card 1 -> " + deck.get(0));
        System.out.println("Card 2 -> " + deck.get(1));
    }

    public void displayCardsFromSameSuit(String suit) {
        System.out.println("Cards with suit " + suit + ":");
        for (Cards card : deck) {
            if (card.getSuit().equals(suit)) {
                System.out.println(card);
            }
        }
    }

    public void sameCard() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first card suit: ");
        String suit1 = scanner.next();
        System.out.print("Enter second card suit: ");
        String suit2 = scanner.next();
        System.out.println(suit1.equalsIgnoreCase(suit2) ? "Cards are from the same suit." : "Cards are from different suits.");
    }

    public void compareCard() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first card rank: ");
        String rank1 = scanner.next();
        System.out.print("Enter second card rank: ");
        String rank2 = scanner.next();
        System.out.println(rank1.equalsIgnoreCase(rank2) ? "Cards have the same rank." : "Cards have different ranks.");
    }

    public void findCard() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter card rank: ");
        String rank = scanner.next();
        System.out.print("Enter card suit: ");
        String suit = scanner.next();
        boolean found = false;
        for (Card card : cards) {
            if (card.getRank().equalsIgnoreCase(rank) && card.getSuit().equalsIgnoreCase(suit)) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "Card found in deck." : "Card not found.");
    }

    public void dealCard() {
        Collections.shuffle(cards);
        for (int i = 0; i < 5; i++) {
            System.out.println(cards.get(i));
        }
    }


    

    
}