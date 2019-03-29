import java.util.ArrayList;

public class Airport {
    private ArrayList<Plane> hanger;
    private int airportCode;
    private ArrayList<Flight> flights;
    private ArrayList<Ticket> tickets;

    public Airport(int airportCode){
        this.hanger = new ArrayList<>();
        this.airportCode = airportCode;
        this.flights = new ArrayList<>();
        this.tickets = new ArrayList<>();
    }

    public Airport(int airportCode, ArrayList<Plane> hanger, ArrayList<Ticket> tickets){
        this.hanger = hanger;
        this.airportCode = airportCode;
        this.flights = new ArrayList<>();
        this.tickets = tickets;

    }

    public int getTotalFlightCount(){
        return this.flights.size();
    }

    public void createFlight(Plane plane, int flightNumber, String destination, int distance){
        Flight flight = new Flight(plane, flightNumber, destination, distance);
        this.flights.add(flight);
    }

    public int getPlaneCount(){
        return this.hanger.size();
    }

    public Plane assightPlaneToFlight(Plane plane, Flight flight){
        this.hanger.remove(plane);
           flight.setPlane(plane);
        return plane;
    }

    public int getTicketCount(){
        return this.tickets.size();
    }

    public Ticket sellTicket(Ticket ticket){
        this.tickets.remove(ticket);
        return ticket;

    }

    public boolean canSellTickets(Flight flight, Ticket ticket){
        if(flight.getPlane().getcapacity() > flight.getPlane().getPassengerCount()){
            this.sellTicket(ticket);
            return true;
        }
        return false;
    }


    public void canAssignPlaneToFlight(Flight flight){
        for (Plane plane : this.hanger) {
            if (flight.getPlane().getcapacity() == flight.getDistance()){
                this.assightPlaneToFlight(plane, flight);
            }
        }
    }

    public int getTotalPassengerCountInFlight(Plane plane){
        return plane.getPassengerCount();
    }

    public void replacementPlane(Plane planeA, Flight flight){
        if (planeA.getIfBroken() == true){
            for (Plane plane : hanger){
                if(plane.getcapacity() == planeA.getcapacity()){
                    this.assightPlaneToFlight(plane, flight);
                    this.hanger.remove(plane);
                }
            }
        }
    }

    public int maxWeightPlaneCanCarry(Plane plane){
        int total = plane.getMaxWeight() - plane.getPassengerWeight();
        return total;
    }










}
