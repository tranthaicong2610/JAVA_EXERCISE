package sesison7.baitap.b1;


public class Main {
    public static void main(String[] args) {
        Circle[] circle = new Circle[2];
        circle[0] = new Circle(2);
        circle[1] = new Circle(3);
        System.out.println("dien tich truoc cua hinh tron 1: " +circle[0].getArea());
        System.out.println("dien tich truoc cua hinh tron 2: " +circle[1].getArea());
        circle[0].resize(1.5);
        circle[1].resize(1.5);
        System.out.println("dien tich sau cua hinh tron 1: " +circle[0].getArea());
        System.out.println("dien tich sau cua hinh tron 2: " +circle[1].getArea());

        Rectangle[] rectangles = new Rectangle[2];
        rectangles[0] = new Rectangle(2,2);
        rectangles[1] = new Rectangle(3,3);
        System.out.println("dien tich truoc cua hinh tron 1: " +rectangles[0].getArea());
        System.out.println("dien tich truoc cua hinh tron 2: " +rectangles[1].getArea());
        rectangles[0].resize(2);
        rectangles[1].resize(2);
        System.out.println("dien tich sau cua hinh tron 1: " +rectangles[0].getArea());
        System.out.println("dien tich sau cua hinh tron 2: " +rectangles[1].getArea());

        Square[] squares = new Square[2];
        squares[0] = new Square(2);
        squares[1] = new Square(3);
        System.out.println("dien tich truoc cua hinh tron 1: " +squares[0].getArea());
        System.out.println("dien tich truoc cua hinh tron 2: " +squares[1].getArea());
        squares[0].resize(2);
        squares[1].resize(3);
        System.out.println("dien tich sau cua hinh tron 1: " +squares[0].getArea());
        System.out.println("dien tich sau cua hinh tron 2: " +squares[1].getArea());

    }
}
