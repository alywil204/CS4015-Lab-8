import java.util.ArrayList;
import java.util.List;

public class WavFile {
    private List<Segment> segments = new ArrayList<>();

    public static WavFile read(String fileName) {
        // Simulate reading a wav file and building the segments
        var wavFile = new WavFile();
        wavFile.segments.add(new FormatSegment());
        wavFile.segments.add(new FactSegment());
        wavFile.segments.add(new FactSegment());
        wavFile.segments.add(new FactSegment());

        return wavFile;
    }

    public void reduceNoise() {
        this.applyToSegments(new ReduceNoiseVisitor());
    }

    public void addReverb() {
        this.applyToSegments(new AddReverbVisitor());
    }

    public void normalize() {
        this.applyToSegments(new NormalizeVisitor());
    }

    public void applyToSegments(Visitor visitor) {
        for (Segment segment : segments)
            segment.accept(visitor);
    }
}
