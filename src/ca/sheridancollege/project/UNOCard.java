package ca.sheridancollege.project;

import java.util.Arrays;

public class UNOCard extends Card {
    static Iterable<String> COLORS = Arrays.asList("Red", "Green", "Blue", "Yellow");
    static Iterable<String> VALUES = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "Skip", "Reverse", "Draw Two", "Draw Four");

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

    public int getScoreValue() {
        return 0;
    }

    public String getColor() {
        return color;
    }

    public String getValue() {
        return value;
    }
}
