package ovning12;

public class ActorRole {
    private String roleName;
    private Person actor;
    private Movie movie;


    public ActorRole(String roleName, Person actor, Movie movie){
        this.roleName = roleName;
        this.actor = actor;
        this.movie = movie;
    }

    public String toString(){
        return roleName + " in " + movie.getTitle() + ", actor " + actor.toString();
    }
}
