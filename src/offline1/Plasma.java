package offline1;

public class Plasma implements ElectricityConsumer {
    @Override
    public void onElectricityOn() {
        System.out.println("TV On");

    }

    @Override
    public String getType() {
        return this.getClass().getSimpleName();
    }
}
