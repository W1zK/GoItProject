package offline.praktika;

public class VideoCard extends Cpu implements TechSpecification  {
    public VideoMemory videoRam;



    public VideoCard(int core, float freq) {
        super(core, freq);
    }
}
