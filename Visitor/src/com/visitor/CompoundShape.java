package com.visitor;

public class CompoundShape extends Shape{
    /**
     * @param x int
     * @param y int
     */
    @Override
    public void move(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    /**
     *
     */
    @Override
    public void draw() {
        System.out.println("Drawing Compound Shape");

    }

    /**
     * @param v
     */
    @Override
    public void accept(Visitor v) {
        v.visitCompoundGraphic(this);
    }
}
