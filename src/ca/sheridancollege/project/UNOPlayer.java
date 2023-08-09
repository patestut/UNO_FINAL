package ca.sheridancollege.project;

import java.util.ArrayList;

public class UNOPlayer extends Player {
    private ArrayList<UNOCard> hand;

    public UNOPlayer(String name) {
        super(name);
        hand = new ArrayList<>();
    }

    public void drawCard(UNOCard card) {
        hand.add(card);
    }

    public ArrayList<UNOCard> getHand() {
        return hand;
    }

    @Override
    public void play() {

    }
}
