package ovning6;

public class Rational {

    private int upper;
    private int lower;

    public Rational(int upper, int lower){
        if (lower == 0){
            lower = 1;
        }
        this.lower = lower;
        this.upper = upper;
    }
    public Rational(int upper){
        this.upper = upper;
        this.lower = 1;
    }
    public Rational(){
        this.upper = 10;
        this.lower = 1;
    }

    public Rational add(Rational other){
        return new Rational(upper * other.lower + other.upper * lower, lower * other.lower);
    }

    public int getUpper() {
        return upper;
    }

    public int getLower() {
        return lower;
    }

    public void setUpper(int upper) {
        this.upper = upper;
    }

    public void setLower(int lower) {
        this.lower = lower;
    }

    public String toString() {
        return upper + "/" + lower;
    }
}
