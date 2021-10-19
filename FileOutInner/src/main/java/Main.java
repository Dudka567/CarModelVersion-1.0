import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CarModel bmw = new CarModel("BMW");
        CarModel kia = new CarModel("Kia");
        bmw.startEnigne();
        kia.startEnigne();
    }
}
