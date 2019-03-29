import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class TestAirport {
    private Airport airport;
    private Plane plane1;
    private Plane plane2;
    private Plane plane3;
    private Plane plane4;
    private Plane plane5;
    private Flight flight;
    private Ticket ticket1;
    private Ticket ticket2;
    private Passanger passanger1;
    private Passanger passanger2;

    @Before
    public void before(){
        airport = new Airport(456);
        plane1 = new Plane(Capacity.BIRLIN292, "Easy Jet", true, 100, 70);
        plane2 = new Plane(Capacity.FRANCE229, "British Airway", false, 200, 150);
        plane3 = new Plane(Capacity.GOENGR282, "British Airway", true, 200, 150);
        plane4 = new Plane(Capacity.TURKIS272, "British Airway", true, 200, 150);
        plane5 = new Plane(Capacity.BOEING747, "Easy Jet", true, 100, 70);
        flight = new Flight(plane1, 44, "Edinburgh", 200);
        passanger1 = new Passanger();
        passanger2 = new Passanger();
        ticket1 = new Ticket(passanger1, flight);
        ticket2 = new Ticket(passanger2, flight);
    }

    @Test
    public void CreateFlight(){
        airport.createFlight(plane1, 44, "Edinburgh", 200);
        assertEquals(1, airport.getTotalFlightCount());
    }

    @Test
    public void assignPlaneToFlight(){
        ArrayList<Plane> planes = new ArrayList<>();
        ArrayList<Ticket> tickets = new ArrayList<>();
        planes.add(plane1);
        planes.add(plane2);
        tickets.add(ticket1);
        tickets.add(ticket2);
        airport = new Airport(456, planes, tickets);
        airport.assightPlaneToFlight(plane1, flight);
        assertEquals(1, airport.getPlaneCount());
    }

    @Test
    public void sellTickets(){
        ArrayList<Plane> planes = new ArrayList<>();
        ArrayList<Ticket> tickets = new ArrayList<>();
        planes.add(plane1);
        planes.add(plane2);
        tickets.add(ticket1);
        tickets.add(ticket2);
        airport = new Airport(456, planes, tickets);
        airport.sellTicket(ticket1);
        assertEquals(1, airport.getTicketCount());
    }

    @Test
    public void canSellTickets(){
        assertEquals(true, airport.canSellTickets(flight, ticket1));
    }

    @Test
    public void canAssignPlaneToFlight(){
        ArrayList<Plane> planes = new ArrayList<>();
        ArrayList<Ticket> tickets = new ArrayList<>();
        planes.add(plane1);
        planes.add(plane2);
        planes.add(plane5);
        tickets.add(ticket1);
        tickets.add(ticket2);
        airport = new Airport(456, planes, tickets);
        airport.canAssignPlaneToFlight(flight);
        assertEquals(2, airport.getPlaneCount() );
    }

    @Test
    public void countTotalPassengersInFlight(){
        ArrayList<Passanger> passengers = new ArrayList<>();
        passengers.add(passanger1);
        passengers.add(passanger1);
        plane1 = new Plane(Capacity.BIRLIN292, "Easy Jet", false, 100, 70, passengers);
        assertEquals(2, airport.getTotalPassengerCountInFlight(plane1));
    }

//    @Test
//    public void replacementPlane(){
//        ArrayList<Plane> planes = new ArrayList<>();
//        ArrayList<Ticket> tickets = new ArrayList<>();
//        planes.add(plane1);
//        planes.add(plane2);
//        planes.add(plane3);
//        tickets.add(ticket1);
//        tickets.add(ticket2);
//        airport = new Airport(456, planes, tickets);
//        airport.replacementPlane(plane4, flight);
//        assertEquals(2, airport.getPlaneCount());
//    }


    @Test
    public void maxWeightPlaneCanCarry(){
        assertEquals(50, airport.maxWeightPlaneCanCarry(plane2));
    }

}
