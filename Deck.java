package assignment4;

import java.util.ArrayList;
import java.util.Collections;

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


    

    
}