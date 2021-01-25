public class Bus extends Vehicle {
   public Bus(){
       this.spotsNum=5;
       this.type=VehicleType.BUS;
   } 
   public boolean canFitSpot(ParkingSpot spot){
        return spot.getType()==ParkingSpotType.LARGE;
   }
}