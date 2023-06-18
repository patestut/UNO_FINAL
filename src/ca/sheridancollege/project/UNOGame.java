
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author Stuti Patel
 */
public class UNOGame extends Game {

    private GroupOfCards deck;
    private ArrayList<UNOCard> discardPile;
    private String currentColor;

    public UNOGame(String name) {
        super(name);
        deck = new GroupOfCards(108); // UNO deck has 108 cards
        discardPile = new ArrayList<>();
        currentColor = "";
    }

    @Override
    public void play() {
        // Implement UNO game flow here
    }

    @Override
    public void declareWinner() {
        // Implement declaring a winner in UNO here
    }
}
