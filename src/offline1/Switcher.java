package offline1;

public class Switcher {
    ElectricityConsumer[] consumers = new ElectricityConsumer[5];
    private int element = 0;


    public void addElectricityConsumer(ElectricityConsumer consumer){
        if (element>=consumers.length)
            return;
            consumers[element++]=consumer;


    }
    public void electricityEnable(){
        for (int i = 0; i <element ; i++) {
            consumers[i].onElectricityOn();
        }
    }
    public ElectricityConsumer[] getConsumers(){
        ElectricityConsumer[] consumers1 = new ElectricityConsumer[element];
        System.arraycopy(consumers,0,consumers1,0,consumers1.length);
        return consumers1;
    }
}
