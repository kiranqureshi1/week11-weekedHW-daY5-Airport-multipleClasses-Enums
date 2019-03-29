import java.util.ArrayList;

public class Plane {
    private Capacity capacity;
    private String airline;
    private ArrayList<Passanger> passengers;
    private boolean broken;
    private int maxWeight;
    private int passengerWeight;

    public Plane(Capacity capacity, String airline, boolean broken, int maxWeight, int passengerWeight){
        this.capacity = capacity;
        this.airline = airline;
        this.passengers = new ArrayList<>();
        this.broken = broken;
        this.maxWeight = maxWeight;
        this.passengerWeight = passengerWeight;

    }

    public Plane(Capacity capacity, String airline, boolean broken, int maxWeight, int passengerWeight, ArrayList<Passanger> passangers){
        this.capacity = capacity;
        this.airline = airline;
        this.broken = broken;
        this.maxWeight = maxWeight;
        this.passengerWeight = passengerWeight;
        this.passengers = passangers;

    }

    public int getPassengerCount(){
        return this.passengers.size();
    }

    public void addPassenger(Passanger passenger){
        this.passengers.add(passenger);
    }

    public int getcapacity(){
        return this.capacity.getValue();
    }

    public boolean getIfBroken(){
        return this.broken;
    }

    public int getMaxWeight(){
        return this.maxWeight;
    }

    public int getPassengerWeight(){
        return this.passengerWeight;
    }



}
