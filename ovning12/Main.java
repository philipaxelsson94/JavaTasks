package ovning12;


import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person quentin = new Person("Quentin Tarantino", LocalDate.of(1963, 3, 27), "Bla, bla, bla...");
        Person uma = new Person("Uma Thurman", LocalDate.of(1970, 4, 29), "Bla");
        Person tim = new Person("Tim Roth", LocalDate.of(1961, 5, 14), "Bla");
        Movie pulp = new Movie("Pulp fiction", Genre.DRAMA, quentin, LocalDate.of(1994, 5, 12));
        pulp.addActorRole("Mia Wallace", uma);
        pulp.addActorRole("Ringo/Pumpkin", tim);
        pulp.addActorRole("Jimmie", uma);
        System.out.println(pulp.toString());
        List<ActorRole> roles = pulp.getActorRoles();
        for (ActorRole role : roles) {
            System.out.println(role.toString());
        }
    }
}
