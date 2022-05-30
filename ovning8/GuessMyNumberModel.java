package ovning8;
import java.util.Random;

public class GuessMyNumberModel {
    private int secretNr;
    private int guess;
    private int nrOfGuesses;
    private final int limit;

    public GuessMyNumberModel(int limit){
        this.limit = limit;
    }

    public void initGame(){
        nrOfGuesses = 0;
        Random rand = new Random();
        this.secretNr = rand.nextInt(this.limit);
    }
    public int compareGuess(){
        if (guess > secretNr){
            return 1;
        }
        else if (guess == secretNr){
            return 0;
        }
        else return -1;
    }

    public String compareGuessToStr(){
        int nr = compareGuess();
        if (nr == 1){
            return "to high";
        }
        else if (nr == -1){
            return "to low";
        }
        else return "correct!";
    }

    public int getGuess() {
        return guess;
    }

    public void setGuess(int guess) {
        this.guess = guess;
        nrOfGuesses++;
    }

    public int getMAX(){
        return this.limit;
    }

    public int getNoOfGuesses(){
        return nrOfGuesses;
    }

    public int getSecret(){
        return secretNr;
    }
}
