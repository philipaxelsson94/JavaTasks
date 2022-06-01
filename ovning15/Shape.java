package ovning15;

public abstract class Shape implements Movable {
    int x;
    int y;

    public Shape(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Shape(){
        this.x = 10;
        this.y = 5;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public abstract void draw();

    public String toString(){
        return "x=" + x + " y=" + y;
    }
}
