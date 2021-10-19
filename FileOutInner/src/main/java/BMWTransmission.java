public class BMWTransmission implements ITransmission{
    @Override
    public void up() {
        System.out.println("Коробка BMW выполнила команду up()!");
    }

    @Override
    public void down() {
        System.out.println("Коробка BMW выполнила команду down()!");
    }
}
