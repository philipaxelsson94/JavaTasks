package ovning15;

public class Rectangle extends Shape{
    int x2;
    int y2;

    public Rectangle(int x, int y, int x2, int y2){
        super(x,y);
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle");
    }

    @Override
    public String toString(){
        return super.toString() + " x2=" + x2 + " y2=" + y2;
    }

    @Override
    public void move(int dx, int dy) {
        super.setX(getX() + dx);
        this.x2 += dx;
        super.setY(getY()+dy);
        this.y2 += dy;
    }
}
