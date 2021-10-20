import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CarModel bmw = new CarModel(new KiaEngine(),new KiaTransmission());
        CarModel kia = new CarModel(new BMWEngine(),new BMWTransmission());
        bmw.startEnigne();
        kia.startEnigne();
    }
}
