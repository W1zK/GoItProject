package offline.praktika;

public class Cpu implements TechSpecification {
    int core;
    float freq;

    public Cpu(int core, float freq) {
        this.core = core;
        this.freq = freq;
    }
}
