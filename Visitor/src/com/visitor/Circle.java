package com.visitor;

public class Circle extends Shape{
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
        System.out.println("Drawing Circle");

    }

    /**
     * @param v
     */
    @Override
    public void accept(Visitor v) {
        v.visitCircle(this);
    }
}
