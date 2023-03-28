class ReduceNoiseVisitor implements Visitor {
    public void VisitFactSegment(FactSegment segment) {
        segment.reduceNoise();
    }
    public void VisitFormatSegment(FormatSegment segment) {
        segment.reduceNoise();
    }
}