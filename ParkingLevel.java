import java.util.Collections;

public class ParkingLevel {
    private List<ParkingSpot> spots;
    public ParkingLevel(){
        List<ParkingSpot> s = new ArrayList<>();
        this.spots = Collections.unmodifiableList(s);
    }
    public List<ParkingSpot> getSpots(){
        return spots;
    }

    public void assignVehicleToSpot(Vehicle vehicle, ParkingSpot spot) {
        spot.assignVehicle(vehicle);
      }

}