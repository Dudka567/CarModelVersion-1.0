package MyPack; 
public class BMWEngine implements IEngine{
    @Override
    public void start() {
        System.out.println("Двигатель BMW начал работу!");
    }

    @Override
    public void stop() {
        System.out.println("Двигатель BMW закончил работу!");
    }
}
