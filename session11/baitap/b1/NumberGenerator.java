package session11.baitap.b1;

public class NumberGenerator implements Runnable {
    private Thread t;
private String name ;

    public NumberGenerator(String name) {
        this.name = name;
        System.out.println("Thread "+name);
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i < 11; i++) {
                System.out.println("Thread +"+name+"so tu nhien :" + i + " , hashcode " + this.hashCode());
            }
            Thread.sleep(500);

        } catch (InterruptedException e) {
            System.out.println("Thread interrupted. ");
        }
        System.out.println("Thread existing. ");
    }
    public void start(){
        if(t==null){
            t = new Thread(this);
            t.start();
        }
    }
}
