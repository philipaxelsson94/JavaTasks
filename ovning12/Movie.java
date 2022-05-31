package ovning12;

import ovning11.Bid;

import java.time.LocalDate;
import java.util.ArrayList;

public class Movie {
    private String title;
    private Genre genre;
    private Person director;
    private LocalDate release;
    private ArrayList<ActorRole> actorList;

    public Movie(String title, Genre genre, Person director, LocalDate release){
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.release = release;
        this.actorList = new ArrayList<ActorRole>();
    }

    public void addActorRole(String name, Person person){
        actorList.add(new ActorRole(name, person, this));
    }

    public ArrayList<ActorRole> getActorRoles(){
        ArrayList<ActorRole> copy = (ArrayList<ActorRole>) actorList.clone();
        return copy;
    }

    public String getTitle(){
        return title;
    }

    public String toString(){
        return title + ", " + genre + ", released " + release;
    }
}
