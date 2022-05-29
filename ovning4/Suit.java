package ovning4;

public enum Suit {

    DIAMONDS(1), CLUBS(2), HEARTS(3), SPADES(4);

    public int getSuit(){
        return value;
    }

    private final int value;

    private Suit(int value) {
        this.value = value;
    }
}
