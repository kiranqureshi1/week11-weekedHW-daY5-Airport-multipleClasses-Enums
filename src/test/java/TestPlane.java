import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestPlane {

    private Plane plane;
    private Passanger passenger1;
    private Passanger passenger2;

    @Before
    public void before(){
        plane = new Plane(Capacity.BIRLIN292.BIRLIN292, "Easy Jet", false, 100, 70);
        passenger1 = new Passanger();
        passenger2 = new Passanger();
    }

    @Test
    public void getPassengersCount(){
        plane.addPassenger(passenger1);
        assertEquals(1, plane.getPassengerCount());
    }

    @Test
    public void getCapacity(){
        assertEquals(200, plane.getcapacity());
    }

    @Test
    public void getIfbroken(){
        assertEquals(false, plane.getIfBroken());
    }

    @Test
    public void getMaxWeight(){
        assertEquals(100, plane.getMaxWeight());
    }

    @Test
    public void getPassengerWeight(){
        assertEquals(70, plane.getPassengerWeight());
    }


}
