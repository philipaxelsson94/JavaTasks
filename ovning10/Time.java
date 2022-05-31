package ovning10;

public class Time {
    private int h,m,s;


    public Time(int h, int m){
        this.h = h;
        this.m = m;
        this.s = 0;
    }

    public void setTime(int h, int m){
        this.h = h;
        this.m = m;
    }

    public int getH() {
        return h;
    }

    public int getM() {
        return m;
    }

    public int getS() {
        return s;
    }

    public String toString(){
        return this.h + ":" + this.m + ":" + this.s;
    }
}
