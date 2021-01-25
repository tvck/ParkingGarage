public abstract class Vehicle{
    protected List<ParkingSpot> parkingSpots = new ArrayList<>();
    protected String plateNum;
    protected int spotsNum;
    protected VehicleType type;
    public String getPlateNum(){
        return plateNum;
    }

    public void assignTicket(){
        
    }
    public VehicleType getType(){
        return this.type;
    }
    public int getSpotsNum() {
        return this.spotsNum;
    }
    public void setType(VehicleType type){
        this.type = type;
    }
    public void parkToSpot(ParkingSpot spot){
        this.parkingSpots.add(spot);
    }
    public abstract boolean canFitSpot(ParkingSpot spot);
}