package offline1;

public class Main {
    public static void main(String[] args) {
       electricityEnable(new Lamp());
       electricityEnable(new ElectricityConsumer() {
           @Override
           public void onElectricityOn() {
               System.out.println("short circuit");
               doSomthing();
           }
           void doSomthing(){
               doSomthing2();
           }
           void doSomthing2(){
               electricityEnable(new Lamp());
           }
       });
    }
    static void electricityEnable(ElectricityConsumer consumer){
        consumer.onElectricityOn();

    }
}
