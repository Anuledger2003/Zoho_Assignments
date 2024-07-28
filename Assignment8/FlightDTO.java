package assignment8;

public class FlightDTO {


    private static String flightNumber;
    private static String airline;
    private static String departureAirport;
    private static String arrivalAirport;
    private static String departureTime;
    private static String arrivalTime;


    public void displayFlightDetails() {
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Airline: " + airline);
        System.out.println("Departure Airport: " + departureAirport);
        System.out.println("Arrival Airport: " + arrivalAirport);
        System.out.println("Departure Time: " + departureTime);
        System.out.println("Arrival Time: " + arrivalTime);
    }

    public static void main(String[] args) {
    	 flightNumber = "IBCU12";
         airline = "Indian Airlines";
         departureAirport = "INDIAN Airport";
         arrivalAirport = "AMERICAN Airport" ;
         departureTime = "08:00" ;
         arrivalTime = "11:00 AM";
        FlightDTO flight1 = new FlightDTO();
    

        flight1.displayFlightDetails();
        
    }
}
