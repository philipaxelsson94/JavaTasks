package ovning2;

public class Main {

    public static void main(String[] args) throws Exception {
        Student s = new Student("Anders", "TIDAA");
        System.out.println(s.toString());
        s.addCredits(8.0); // passed HI1027
        double credits = s.getCredits();
        System.out.println("credits: " + credits);
        System.out.println(s.toString());
// this should generate an exception
        s.addCredits(-1.0);
    }
}

