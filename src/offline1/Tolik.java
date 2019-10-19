package offline1;

public class Tolik implements ElectricityConsumer {
    @Override
    public void onElectricityOn() {
       if (Math.random()>0.3){
           System.out.println("Tolik podgorel");
        }

    }

    @Override
    public String getType() {
        return this.getClass().getSimpleName();
    }
}
