package ca.sheridancollege.project;

/**
 * A class that represents an UNO card.
 *
 * author Stuti Patel
 */
public class UNOCard extends Card {
    private String color;
    private String value;

    public UNOCard(String color, String value) {
        this.color = color;
        this.value = value;
    }

    @Override
    public String toString() {
        return color + " " + value;
    }
}
