public class Car extends Vehicle {
    public Car(){
        this.spotsNum = 1;
        this.type= VehicleType.CAR;
    }
    public boolean canFitSpot(ParkingSpot spot){
        return spot.getType()==ParkingSpotType.COMPACT || spot.getType()==ParkingSpotType.LARGE;
    }
}