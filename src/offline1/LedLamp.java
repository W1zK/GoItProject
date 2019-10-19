package offline1;

public class LedLamp extends Lamp {
    @Override
    public void onElectricityOn() {
        Filament filament;
        power = 5;
        super.onElectricityOn();
    }
}
