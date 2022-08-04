/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session11.b3;

/**
 *
 * @author Win 10
 */
/**
 *
 */
public class Count implements Runnable {

    private Thread myThread;

    public Count() {
        myThread = new Thread(this, "my runnable thread ");
        System.out.println("my thread created " + myThread);
        myThread.start();
    }

    public Thread getMyThread() {
        return myThread;
    }

    @Override

    public void run() {
        try {
            for (int i = 0; i < 10;
                    i++) {
                System.out.println("Printing the count " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("my thread interrupted");
        }
        System.out.println("my thread run is over");
    }

}
