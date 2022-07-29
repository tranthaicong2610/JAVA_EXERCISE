package generics.apply_class.generics_interface;

interface Writer<T> {
    void update(T obj );
    void delete(T obj);
    void write(T obj);
}
class Book<T> implements Writer<T>{

    @Override
    public void update(T obj) {

    }

    @Override
    public void delete(T obj) {

    }

    @Override
    public void write(T obj) {

    }
}
public class Main {
    public static void main(String[] args) {
        Book<String> t = new Book<String>();
        t.write("hello world");
    }
}
