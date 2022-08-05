package session11.baitap.b2;

public class OddThread implements Runnable{
    @Override
    public void run() {

        try {
            for (int i = 1; i < 10; i+=2) {
                System.out.println("Number value : " + i);
                Thread.sleep(15);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
