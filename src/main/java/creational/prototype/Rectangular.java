package creational.prototype;

public class Rectangular extends Shape {
    public final int width;
    public final int height;

    public Rectangular(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public Rectangular(Rectangular source) {
        super(source);
        this.width = source.width;
        this.height = source.height;
    }

    @Override
    public Cloneable clone() {
        return new Rectangular(this);
    }

    @Override
    public String toString() {
        return "Rectangular{" +
                "width=" + width +
                ", height=" + height +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
