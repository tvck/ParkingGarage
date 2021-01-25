public class MotorCycle extends Vehicle {
    public MotorCycle(){
        this.spotsNum=1;
        this.type=VehicleType.MOTORCYCLE;
    }
    public boolean canFitSpot(ParkingSpot spot){
        return spot.getType()==ParkingSpotType.LARGE || spot.getType()==ParkingSpotType.COMPACT || spot.getType()==ParkingSpotType.MOTORCYCLE;
    }
}