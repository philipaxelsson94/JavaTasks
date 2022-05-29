package ovning1;
import java.util.Random;

public class Dice {
    private int value;

    Random rand = new Random();
    public Dice(){
        value = 1;
    }

    public int throwDice(){
        value = (int)(Math.random()*6)+1;
        return value;
    }

    public int getValue(){
        return value;
    }


    public String toString(){
        return "" + value;
    }
}
