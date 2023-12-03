package com.visitor;

public interface Visitor {
    public void visitDot(Dot d);
    public void visitCircle(Circle c);
    public void visitRectangle(Rectangle r);

    public void visitCompoundGraphic(CompoundShape cs);

}
