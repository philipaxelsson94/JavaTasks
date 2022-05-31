package ovning12;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate prsNr;
    private String bio;

    public Person(String name, LocalDate prsNr, String bio){
        this.name = name;
        this.prsNr = prsNr;
        this.bio = bio;
    }

    public String toString(){
        return name;
    }
}
