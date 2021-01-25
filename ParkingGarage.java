public class ParkingGarage {
    private final ParkingLevel[] levels;
    public ParkingGarage(int n){
        this.levels = new ParkingLevel[n];
    }
    public ParkingLevel[] getLevels(){
        return levels;
    }
}