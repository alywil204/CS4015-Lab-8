public class FactSegment extends Segment {
    public void accept(Visitor v) {
        v.VisitFactSegment(this);
    }
}
