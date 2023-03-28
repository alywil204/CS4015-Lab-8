public abstract class Segment {
    public void reduceNoise() {
        System.out.println("Reduce noise");
    }

    public void addReverb() {
        System.out.println("Add reverb");
    }

    public void normalize() {
        System.out.println("Normalize");
    }

    public abstract void accept(Visitor v);
}
