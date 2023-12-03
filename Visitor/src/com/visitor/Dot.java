package com.visitor;

public class Dot extends Shape{

    @Override
    public void move(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Dot");
    }

    @Override
    public void accept(Visitor v) {
        v.visitDot(this);
    }
}
