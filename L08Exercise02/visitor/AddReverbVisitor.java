class AddReverbVisitor implements Visitor {
    public void VisitFactSegment(FactSegment segment) {
        segment.addReverb();
    }
    public void VisitFormatSegment(FormatSegment segment) {
        segment.addReverb();
    }
}