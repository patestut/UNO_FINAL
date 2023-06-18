package ca.sheridancollege.project;

/**
 * This is the main class to run the game.
 * Add your name as an author and the date!
 *
 * author Stuti Patel
 */
public class Main {
    public static void main(String[] args) {
        UNOGame unoGame = new UNOGame("UNO");

        // Add players to the game
        unoGame.getPlayers().add(new UNOPlayer("Player 1"));
        unoGame.getPlayers().add(new UNOPlayer("Player 2"));

        unoGame.play(); // Start the game
        unoGame.declareWinner(); // Declare the winner
    }
}
