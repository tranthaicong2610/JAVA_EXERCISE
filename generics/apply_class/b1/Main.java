package generics.apply_class.b1;

public class Main {
    public static void main(String[] args) {
        MyGeneric<Integer> m1 = new MyGeneric<Integer>();
        m1.add(2);
        m1.add(1);
        System.out.println(m1.get());
    }
}
