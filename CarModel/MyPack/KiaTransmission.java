package MyPack; 
public class KiaTransmission implements ITransmission{
    @Override
    public void up() {
        System.out.println("Коробка Kia выполнила команду up()!");
    }

    @Override
    public void down() {
        System.out.println("Коробка Kia выполнила команду down()!");
    }
}
