class IncreaseBassVisitor implements Visitor {
    public void VisitFactSegment(FactSegment segment) {
        System.out.println("Increase bass in fact segment");
    }
    public void VisitFormatSegment(FormatSegment segment) {
        System.out.println("Increase bass in format segment");
    }
}