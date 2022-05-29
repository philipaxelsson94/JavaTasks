package ovning4;

public class ICard {
    private Rank rank;
    private Suit suit;

    public ICard(Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank.getRank();
    }

    public int getSuit() {
        return suit.getSuit();
    }

    public String toString(){
        return rank + " of " + suit;
    }
    public boolean equals(ICard other){
        return this.rank == other.rank && this.suit == other.suit;
    }
    public int compare(ICard other){
        return this.rank.getRank() - other.rank.getRank();
    }
}
