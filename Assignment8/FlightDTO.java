package assignment8;

public class FlightDTO {


    private String flightNumber;
    private String airline;
    private String departureAirport;
    private String arrivalAirport;
    private String departureTime;
    private String arrivalTime;


    private static int flightCount = 0;

    public FlightDTO(String flightNumber, String airline, String departureAirport, String arrivalAirport, String departureTime, String arrivalTime) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        flightCount++;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

 
    public static int getFlightCount() {
        return flightCount;
    }

    public void displayFlightDetails() {
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Airline: " + airline);
        System.out.println("Departure Airport: " + departureAirport);
        System.out.println("Arrival Airport: " + arrivalAirport);
        System.out.println("Departure Time: " + departureTime);
        System.out.println("Arrival Time: " + arrivalTime);
    }

    public static void main(String[] args) {
        FlightDTO flight1 = new FlightDTO("IBCU12", "Indian Airlines", "INDIAN Airport", "AMERICAN Airport", "08:00", "11:00");
        FlightDTO flight2 = new FlightDTO("DLU456", "Delta Airlines", "ATL", "SFO", "09:00", "12:00");

        flight1.displayFlightDetails();
        flight2.displayFlightDetails();

        System.out.println("Total number of flights: " + FlightDTO.getFlightCount());
    }
}
