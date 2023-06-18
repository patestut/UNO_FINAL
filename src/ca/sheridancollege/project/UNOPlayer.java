package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * A class that represents an UNO player.
 *
 * author Stuti Patel
 */
public class UNOPlayer extends Player {

    private ArrayList<Card> hand;

    public UNOPlayer(String name) {
        super(name);
        hand = new ArrayList<>();
    }

    public void drawCard(Card card) {
        hand.add(card);
    }

    @Override
    public void play() {
        // Implement UNO gameplay logic here
    }
}
