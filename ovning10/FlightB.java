package ovning10;

public class FlightB {

    private String destination;
    private String flightNr;
    private Time departureTime;

    public FlightB(String destination, String flightNr, int h, int m){
        this.destination = destination;
        this.flightNr = flightNr;
        this.departureTime = new Time(h,m);
    }

    public Time getDepTime(){
        int h = departureTime.getH();
        int m = departureTime.getM();
        return new Time(h, m);
    }

    public String toString(){
        return this.destination + ", " + this.flightNr + ", " + getDepTime();
    }
}
