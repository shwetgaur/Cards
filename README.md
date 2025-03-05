# Card Deck Program

## Overview
This Java program simulates a deck of 52 playing cards. It provides various operations such as printing the deck, shuffling, dealing cards, and comparing cards based on rank or suit.

## Features
- Create a deck of 52 cards.
- Print the entire deck.
- Print a specific card based on input.
- Check if two cards belong to the same suit.
- Compare two cards by rank.
- Search for a specific card in the deck.
- Deal 5 random cards.
- Shuffle the deck.
- Menu-driven interface for easy interaction.

## Classes and Methods
### `Card.java`
- Represents an individual playing card.
- Stores the suit and rank of a card.

### `Deck.java`
- Manages a deck of cards using an `ArrayList`.
- Contains the following methods:
  - `createDeck()` - Initializes the deck.
  - `printDeck()` - Displays all cards in the deck.
  - `printCard()` - Prints a specific card based on user input.
  - `sameCard()` - Checks if two cards are from the same suit.
  - `compareCard()` - Compares two cards based on rank.
  - `findCard()` - Searches for a specific card.
  - `dealCard()` - Prints 5 random cards from the deck.
  - `shuffleDeck()` - Shuffles the deck.

### `Main.java`
- Contains the main method with a menu-driven program for user interaction.



## Commit History and GitHub Link
[GitHub Repository Link](https://github.com/shwetgaur/Cards.git)
