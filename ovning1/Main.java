package ovning1;

public class Main {

    public static void main(String[] args) {
        Dice d1 = new Dice();
        Dice d2 = new Dice();
        System.out.println(d1.toString() + ", " + d2.toString()); // 1, 1
        d1.throwDice();
        d2.throwDice();
        System.out.println(d1.toString() + ", " + d2.toString()); // random

        Dice d3 = new Dice();
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;

        for (int i = 0; i < 1000; i++){
            d3.throwDice();
            if (d3.getValue() == 1){
                one += 1;
            }
            else if (d3.getValue() == 2){
                two += 1;
            }
            else if (d3.getValue() == 3){
                three += 1;
            }
            else if (d3.getValue() == 4){
                four += 1;
            }
            else if (d3.getValue() == 5){
                five += 1;
            }
            else if (d3.getValue() == 6){
                six += 1;
            }
        }
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
    }

}


