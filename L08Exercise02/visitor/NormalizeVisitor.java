class NormalizeVisitor implements Visitor {
    public void VisitFactSegment(FactSegment segment) {
        segment.normalize();
    }
    public void VisitFormatSegment(FormatSegment segment) {
        segment.normalize();
    }
}