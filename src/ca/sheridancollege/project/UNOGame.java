package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class UNOGame extends Game {

    private GroupOfCards deck;
    private ArrayList<UNOCard> discardPile;
    private String currentColor;

    public UNOGame(String name) {
        super(name);
        deck = new GroupOfCards(108);
        discardPile = new ArrayList<>();
        currentColor = "";
    }

    @Override
    public void play() {
        initializeGame();
        boolean gameEnd = false;

        while (!gameEnd) {
            for (Player player : getPlayers()) {
                if (!gameEnd) {
                    System.out.println("\n" + player.getName() + "'s turn!");
                    playerTurn((UNOPlayer) player);
                    gameEnd = checkGameEnd((UNOPlayer) player);
                }
            }
        }
    }

    @Override
    public void declareWinner() {
        UNOPlayer winner = null;
        int minScore = Integer.MAX_VALUE;

        for (Player player : getPlayers()) {
            int score = calculateScore((UNOPlayer) player);
            System.out.println(player.getName() + "'s score: " + score);

            if (score < minScore) {
                minScore = score;
                winner = (UNOPlayer) player;
            }
        }

        System.out.println("\nWinner: " + winner.getName());
    }

    private void initializeGame() {
        // Create and shuffle the deck of UNO cards
        deck = new GroupOfCards(108);
        for (String color : UNOCard.COLORS) {
            for (String value : UNOCard.VALUES) {
                deck.getCards().add(new UNOCard(color, value));
                if (!value.equals("0")) {
                    deck.getCards().add(new UNOCard(color, value));
                }
            }
        }
        deck.shuffle();

        // Deal 7 cards to each player
        for (Player player : getPlayers()) {
            for (int i = 0; i < 7; i++) {
                player.drawCard((UNOCard) deck.getCards().remove(0));
            }
        }

        // Place the first card from the deck to the discard pile
        discardPile.add((UNOCard) deck.getCards().remove(0));
        currentColor = ((UNOCard) discardPile.get(0)).getColor();
    }

    private void playerTurn(UNOPlayer player) {
        Scanner scanner = new Scanner(System.in);
        boolean validMove = false;

        while (!validMove) {
            System.out.println("Current Card on Discard Pile: " + discardPile.get(discardPile.size() - 1));
            System.out.println("Your Hand: " + player.getHand());

            for (int i = 0; i < player.getHand().size(); i++) {
                System.out.println((i + 1) + ": " + player.getHand().get(i));
            }

            System.out.println("Enter the number of the card you want to play (or 0 to draw a card):");
            int choice = scanner.nextInt();

            if (choice == 0) {
                // Draw a card from the deck
                if (deck.getCards().size() > 0) {
                    player.drawCard((UNOCard) deck.getCards().remove(0));
                    validMove = true;
                } else {
                    System.out.println("Deck is empty. Cannot draw a card.");
                   
                }
            } else if (choice >= 1 && choice <= player.getHand().size()) {
                UNOCard cardToPlay = player.getHand().get(choice - 1);
                if (cardToPlay.getColor().equals(currentColor) || cardToPlay.getValue().equals(discardPile.get(discardPile.size() - 1).getValue())) {
                    // Valid move, remove the card from the player's hand and add to discard pile
                    player.getHand().remove(choice - 1);
                    discardPile.add(cardToPlay);
                    currentColor = cardToPlay.getColor();
                    validMove = true;
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private boolean checkGameEnd(UNOPlayer player) {
        if (player.getHand().isEmpty()) {
            System.out.println("\n" + player.getName() + " has no cards left. They win!");
            return true;
        }
        return false;
    }

    private int calculateScore(UNOPlayer player) {
        int score = 0;
        for (UNOCard card : player.getHand()) {
            score += card.getScoreValue();
        }
        return score;
    }
}
