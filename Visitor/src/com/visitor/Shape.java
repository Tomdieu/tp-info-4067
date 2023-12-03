package com.visitor;

public abstract class Shape {
    private int x, y;

    /**
     * @param x int
     * @param y int
     */
    public abstract void move(int x, int y);

    /**
     * Draw shape
     */
    public abstract void draw();

    public abstract void accept(Visitor v);

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        Class<?> _class = this.getClass();
        String className = _class.getSimpleName();
        return className+"{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
