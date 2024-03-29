package sesison7.baitap.b1;

public class Square extends Shape implements Resizeable {
    private double width;

    public Square() {
    }

    public Square(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return this.width * this.width;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.width = width * percent;
    }
}
