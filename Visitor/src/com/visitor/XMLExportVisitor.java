package com.visitor;

public class XMLExportVisitor implements Visitor {
    /**
     * @param d
     */
    @Override
    public void visitDot(Dot d) {
        System.out.println("Visiting " + d);
    }

    /**
     * @param c
     */
    @Override
    public void visitCircle(Circle c) {
        System.out.println("Visiting " + c);
    }

    /**
     * @param r
     */
    @Override
    public void visitRectangle(Rectangle r) {
        System.out.println("Visiting " + r);

    }

    /**
     * @param cs
     */
    @Override
    public void visitCompoundGraphic(CompoundShape cs) {
        System.out.println("Visiting " + cs);

    }
}
