package session11.baitap.b2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();
        Thread t1 = new Thread(oddThread);
        Thread t2 = new Thread(evenThread);
        t1.start();
        t1.join();
        t2.start();
    }
}
