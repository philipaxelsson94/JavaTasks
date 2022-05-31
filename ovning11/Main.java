package ovning11;



public class Main {
    public static void main(String[] args) {
        User anders = new User("Anders", "aslm@kth.se", "42");
        User reine = new User("Reine", "rebm@kth.se", "4711");
        Auction auction = new Auction(reine, "The Shining, DVD");
        auction.addBid(new Bid(anders, 100));
        auction.addBid(new Bid(anders, 200));
        System.out.println(auction.toString());
        System.out.println(auction.getBids().toString());
    }
}
