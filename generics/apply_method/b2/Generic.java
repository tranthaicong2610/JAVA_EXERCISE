package generics.apply_method.b2;

import java.util.ArrayList;
import java.util.List;

abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {

    @Override
    void draw() {
        System.out.println("ve hinh chu nhat ");
    }

}

class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("ve hinh tron");
    }
}

public class Generic {
    public static void drawShapes(List<? extends Shape> list) {
        for (Shape s : list) {
            s.draw();
        }
    }

    public static void main(String[] args) {
        List<Rectangle> list1 = new ArrayList<Rectangle>();
        list1.add(new Rectangle());
        List<Circle> list2 = new ArrayList<Circle>();
        list2.add(new Circle());
        list2.add(new Circle());
        drawShapes(list1);
        drawShapes(list2);
    }
}

