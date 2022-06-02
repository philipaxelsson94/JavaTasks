package ovning17;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Money m = new Money(Currency.EUR, 100.3245);
        Money n = new Money(Currency.EUR, 100);
        System.out.println(m.toString());
        m.subtract(n);
        System.out.println(n.toString());
        System.out.println(n.add(m).toString());
        Money p = new Money(Currency.EUR, 74.999);
        Money k = new Money(Currency.EUR, 34.032123);
        ArrayList<Money> list = new ArrayList<Money>();
        list.add(p);
        list.add(m);
        list.add(n);
        list.add(k);
        System.out.println("\n");
        for (Money mon : list){
            System.out.println(mon);
        }

        System.out.println("\n");
        Collections.sort(list);

        for (Money mon : list){
            System.out.println(mon);
        }


    }
}
