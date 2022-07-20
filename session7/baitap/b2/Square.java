package sesison7.baitap.b2;

public class Square implements Colorable {
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
    public void howToColor() {
        System.out.println("Color all four sides..");
    }
}
