public class Demo {
    public static void main(String[] args) {
        WavFile file = WavFile.read("filename.wav");
        file.reduceNoise();
        file.addReverb();
        file.normalize();
        // Use "Increase Bass" plugin
        file.applyToSegments(new IncreaseBassVisitor());
    }
}