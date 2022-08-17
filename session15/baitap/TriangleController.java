package session15.baitap;

public class TriangleController implements Triangle {

    @Override
    public void checktriango(float a, float b, float c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new ArithmeticException("ban phai nhap cac canh lon hon 0");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new ArithmeticException("3 cach ban nhap vao ko the tao ra 1 tam giac");
        }


    }
}
