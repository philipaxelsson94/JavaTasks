package ovning10;

public class FlightA {

    private String destination;
    private String flightNr;
    private Time departureTime;

    public FlightA(String destination, String flightNr, Time departureTime){
        this.destination = destination;
        this.flightNr = flightNr;
        this.departureTime = departureTime;
    }

    public Time getDepTime(){
        return departureTime;
    }

    public String toString(){
        return this.destination + ", " + this.flightNr + ", " + getDepTime();
    }
}
