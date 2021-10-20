package MyPack; 
public class KiaEngine implements IEngine{
    @Override
    public void start() {
        System.out.println("Двигатель Kia начал работу!");
    }

    @Override
    public void stop() {
        System.out.println("Двигатель Kia закончил работу!");
    }
}
