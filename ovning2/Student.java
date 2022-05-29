package ovning2;

public class Student {

    private final String name;
    private String program;
    private double credits;

    Student(String name, String program){
        this.name = name;
        this.program = program;
    }
    public void addCredits(double c) throws IllegalArgumentException{
        if (c < 0) throw new IllegalArgumentException("Credits can't be negative");
        else this.credits += c;
    }

    public double getCredits(){
        return this.credits;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String toString(){
        String info = name + ", program: " + program  + ", credits: " + credits;
        return info;
    }
}
