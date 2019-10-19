package offline.praktika;

public class Smartphone extends Items implements TechSpecification{
    public OperationSystem os;
    public Ram ram;
    public Cpu cpu;
    public Screen screen;


    public Smartphone(int id, String name, double value, String other, double price) {
        super(id, name, value, other, price);
    }

    @Override
    public void show() {
        super.show();

    }
}
