package ovning10;

public class Main {
    public static void main(String[] args) {
        FlightA flight = new FlightA("Stockholm", "SK1234", new Time(13,30));
        System.out.println(flight.toString());
        Time depTime = flight.getDepTime();
        //depTime.tic(1800); // seconds
        System.out.println(flight.toString());

        FlightB f2 = new FlightB("Stockholm", "SK0000", 17, 30);
        System.out.println(f2.toString());


    }
}
