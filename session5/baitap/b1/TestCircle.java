package sesion5.baitap.b1;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getRadius());
        System.out.println(circle.getColor());
        Circle circle1 = new Circle(2.0);
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getColor());
    }
}
