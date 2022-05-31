package ovning11;

public class Bid {
    private User user;
    private int bid;

    public Bid(User user, int bid){
        this.user = user;
        this.bid = bid;
    }

    public String toString(){
        return user.toString() + ": " + bid;
    }
}
