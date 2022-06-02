package ovning16;

import ovning4.ICard;
import ovning4.Rank;
import ovning4.Suit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<ICard> cards = new ArrayList<ICard>();
        ArrayList<ICard> cards2 = new ArrayList<ICard>();
        ICard c1 = new ICard(Rank.FIVE,Suit.CLUBS);
        ICard c2 = new ICard(Rank.THREE,Suit.CLUBS);
        ICard c3 = new ICard(Rank.FIVE,Suit.HEARTS);
        ICard c4 = new ICard(Rank.TEN,Suit.DIAMONDS);
        ICard c5 = new ICard(Rank.SEVEN,Suit.DIAMONDS);

        cards2.add(c1);
        cards2.add(c2);
        cards2.add(c3);
        cards2.add(c4);
        cards2.add(c5);

        for (ICard c : cards2){
            System.out.println(c.toString());
        }

        Collections.sort(cards2);

        System.out.println("\n");
        for (ICard c : cards2){
            System.out.println(c.toString());
        }



    }
}
