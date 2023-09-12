package creational.prototype;

public abstract class Shape implements Cloneable {
    public final int x;
    public final int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Shape(Shape source) {
        this(source.x, source.y);
    }

    public abstract Cloneable clone();
}
