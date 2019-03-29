public class Flight {
    private Plane plane;
    private int flightNumber;
    private String destination;
    private int distance;

    public Flight(Plane plane, int flightNumber, String destination, int distance){
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.distance = distance;
    }

    public Plane getPlane(){
        return this.plane;
    }

    public void setPlane(Plane newPlane){
        this.plane = newPlane;
    }

    public int getPlaneCapacity(){
        return this.plane.getcapacity();
    }

    public int getDistance(){
        return this.distance;
    }




}

