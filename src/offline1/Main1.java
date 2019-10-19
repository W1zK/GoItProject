package offline1;

public class Main1 {
    public static void main(String[] args) {
       electricityEnable(new Lamp());
       electricityEnable(new ElectricityConsumer() {
           @Override
           public void onElectricityOn() {
               System.out.println("short circuit");
               doSomthing();
           }

           @Override
           public String getType() {
               return null;
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
