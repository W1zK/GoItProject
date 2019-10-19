package offline1;

public class Lamp implements ElectricityConsumer {
    protected int power;
    Filament filament;
    @Override
    public void onElectricityOn() {
        System.out.println("lamp switch On");
    }

    @Override
    public String getType() {
        return this.getClass().getSimpleName();
    }


    class Filament{
        int lenght;
        String description;
    }
    @MyAnnot("2156")
    private void dom(String s){
        System.out.println(s);
    }
}
