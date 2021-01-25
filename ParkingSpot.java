public class ParkingSpot {
    private String number;
    private ParkingSpotType type;
    private Vehicle vehicle;
    private boolean isFree;
    public ParkingSpot(ParkingSpotType type){
        this.type = type;
    }
    public void assignVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        this.isFree = false;
    }
    public void removeVehicle(){
        this.vehicle = null;
        this.isFree = true;
    }
    public String getNumber(){
        return number;
    }
    public void setNumber(String num){
        this.number=num;
    }
    public ParkingSpotType getType(){
        return this.type;
    }
}