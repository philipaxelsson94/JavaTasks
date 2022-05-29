package ovning4;

public class Main {
    public static void main(String[] args) {

        ICard c1 = new ICard(Rank.TWO, Suit.DIAMONDS);
        ICard c2 = new ICard(Rank.KING, Suit.DIAMONDS);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c1.getRank());
        if (c1.getRank() > c2.getRank()) {
            System.out.println(c1.toString()
                    + " has higher rank than " + c2.toString());
        } else {
            System.out.println(c2.toString()
                    + " has higher rank than " + c1.toString());
        }

        ICard c3 = new ICard(Rank.TWO, Suit.HEARTS);
        ICard c4 = new ICard(Rank.ACE, Suit.HEARTS);
        boolean isEqual = c3.equals(c4);
        System.out.println("The cards are considered equal: " + isEqual);
        boolean isSameInstance = c3 == c4;
        System.out.println("The cards are considered the same: " + isSameInstance);
    }
}
