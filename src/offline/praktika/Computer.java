package offline.praktika;

public class Computer extends Items implements TechSpecification {
    public Cpu cpu;
    public Ram ram;
    public OperationSystem os;
    public VideoCard video;

    public Computer(int id, String name, double value, String other, double price) {
        super(id, name, value, other, price);
    }

    @Override
    public void show() {
        super.show();
    }
}
