package ovning5;

import java.time.LocalDate;

public class PostIt {
    private String note;
    private static int count = 0;
    private final int number;
    private static LocalDate published;


    public PostIt(String note){
        this.note = note;
        count++;
        number = count;
        this.published = LocalDate.now();
    }

    public void append(String s){
        this.note = s;
        this.published = LocalDate.now();
    }

    public int nrOfPosts() {
        return number;
    }

    public String toString(){
        String info = "message: " + note + " date: " + published + " number: " + number;
        return info;
    }
}
