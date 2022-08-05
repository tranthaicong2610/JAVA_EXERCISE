package session11.baitap.b2;

public class EvenThread implements Runnable {
    @Override
    public void run() {

        try {
            for (int i = 2; i <= 10; i+=2) {
                System.out.println("Number value : " + i);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

