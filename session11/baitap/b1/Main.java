package session11.baitap.b1;

public class Main {
    public static void main(String[] args) {
        NumberGenerator n1 = new NumberGenerator("Thread 1 :");
        n1.start();
        NumberGenerator n2 = new NumberGenerator("Thread 2: ");
        n2.start();
        Thread t1 = new Thread(n1);
        Thread t2 = new Thread(n2);
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
    }
}
