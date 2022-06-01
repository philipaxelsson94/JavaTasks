package ovning15;

public class Circle extends Shape{

    int radius;

    public Circle(int radius, int x, int y){
        super(x,y);
        this.radius = radius;
    }

    public Circle(){
        super();
        this.radius = 20;
    }

    @Override
    public void draw() {
        System.out.println("Circle");
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    @Override
    public String toString(){
        return super.toString() + " " + "radius=" + radius;
    }

    @Override
    public void move(int dx, int dy) {

    }
}
