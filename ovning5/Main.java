package ovning5;


public class Main {

    public static void main(String[] args) {
        PostIt p = new PostIt("Buy milk");
        p.append("Call the doctor");
        PostIt q = new PostIt("Feed the cat");
        q.append("...and the dog");
        PostIt r = new PostIt("Relax");
        r.append("Go to the cinema");
        System.out.println(p.toString());
        System.out.println(q.toString());
        System.out.println(r.toString());
        System.out.println(p.nrOfPosts());
    }
}