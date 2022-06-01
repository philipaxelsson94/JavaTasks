package ovning15;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(10, 1, 1);
        System.out.println(c.toString());

        Circle c1 = new Circle(10,20,20);
        Shape cs = c1;
        System.out.println(cs.toString());

        Rectangle r = new Rectangle(15 ,15, 12, 12);
        System.out.println(r.toString());
        r.move(10,10);
        System.out.println(r.toString());


        ArrayList<Shape> list = new ArrayList<Shape>();
        list.add(c);
        list.add(c1);
        list.add(r);

        Rectangle p = (Rectangle) list.get(2);
        System.out.println(p.getX2());

        //Polymorfism
        for (Shape s : list){
            s.draw();
        }



    }
}
