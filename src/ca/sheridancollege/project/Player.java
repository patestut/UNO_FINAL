package ca.sheridancollege.project;

public abstract class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void play();

    void drawCard(UNOCard unoCard) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
