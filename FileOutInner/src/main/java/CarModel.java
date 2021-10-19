public class CarModel {
    protected IEngine engine;
    protected ITransmission transmission;

    public CarModel(String name){

        if(name.equals("BMW")){
            engine = new BMWEngine();
            transmission = new BMWTransmission();
        }else if(name.equals("Kia")){
            engine = new KiaEngine();
            transmission = new KiaTransmission();
        }

    }

    public void setEngine(String name){
        if(name.equals("BMW")) engine = new BMWEngine();
        else if(name.equals("Kia")) engine = new KiaEngine();

    };
    public void setTransmission(String name){
        if(name.equals("BMW")) transmission = new BMWTransmission();
        else if(name.equals("Kia")) transmission = new KiaTransmission();
    };

    public void startEnigne(){engine.start();};
    public void stopEngine(){engine.stop();};
    public void upTransmission(){transmission.up();};
    public void downTransmission(){transmission.down();};

}
