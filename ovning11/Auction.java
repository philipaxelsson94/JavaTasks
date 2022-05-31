package ovning11;

import java.util.ArrayList;
import java.util.List;

public class Auction {
        private User owner;
        private String item;
        private int numberOfBids;
        private ArrayList<Bid> bids;

        public Auction(User owner, String item){
            this.owner = owner;
            this.item = item;
            this.bids = new ArrayList<Bid>();
            this.numberOfBids = 0;
        }

        public void addBid(Bid b){
            bids.add(b);
        }

        public ArrayList<Bid> getBids(){
            ArrayList<Bid> copy = (ArrayList<Bid>) bids.clone();
            return copy;
        }

        public String toString(){
            StringBuilder sb=new StringBuilder(this.owner + ", " + item + " " + "[bids: ");
            for(Bid b : bids){
                sb.append(b.toString());
            }
            sb.append("]");
            return sb.toString();
        }
}

