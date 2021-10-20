package MyPack; 
public class CarModelling {
    public static void main(String[] args) {
        CarModel bmw = new CarModel(new KiaEngine(),new KiaTransmission());
        CarModel kia = new CarModel(new BMWEngine(),new BMWTransmission());
        bmw.startEnigne();
        kia.startEnigne();
    }
}
