package com.visitor;

public class Rectangle extends Shape{
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
        System.out.println("Drawing Rectangle");

    }

    /**
     * @param v
     */
    @Override
    public void accept(Visitor v) {
        v.visitRectangle(this);
    }
}
