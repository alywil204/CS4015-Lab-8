public class FormatSegment extends Segment {
    public void accept(Visitor v) {
        v.VisitFormatSegment(this);
    }
}
