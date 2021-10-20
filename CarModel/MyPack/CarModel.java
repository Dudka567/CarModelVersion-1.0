package MyPack; 
public class CarModel {
    protected IEngine engine;
    protected ITransmission transmission;

    public CarModel(IEngine en, ITransmission tr){
        engine = en;
        transmission = tr;
        }

    public void startEnigne(){engine.start();};
    public void stopEngine(){engine.stop();};
    public void upTransmission(){transmission.up();};
    public void downTransmission(){transmission.down();};

}
