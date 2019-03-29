import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class TestFlight {

    private Flight flight;
    private Plane plane1;
    private Plane plane2;


    @Before
    public void before(){
        plane1 = new Plane(Capacity.BIRLIN292.BIRLIN292, "Easy Jet", false, 100, 70);
        plane2 = new Plane(Capacity.BIRLIN292.FRANCE229, "British Airway", false, 200, 150);
        flight = new Flight(plane1,44, "Edinburgh", 100);
    }

    @Test
    public void getPlane(){
        plane1 = flight.getPlane();
        assertEquals(plane1, flight.getPlane());
    }

    @Test
    public void setPlane(){
        flight.setPlane(plane2);
        assertEquals(plane2, flight.getPlane());

    }

    @Test
    public void getDistance(){
        assertEquals(100, flight.getDistance());
    }

}
