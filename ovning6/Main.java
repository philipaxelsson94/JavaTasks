package ovning6;


public class Main {

    public static void main(String[] args) {
        Rational r1 = new Rational(3, 0);
        Rational r2 = new Rational(5, 30);
        Rational r3 = new Rational(7);
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r2 = " + r3);

        Rational r4 = r1.add(r2);
        System.out.println("r1 + r2 = " + r4);

    }
}