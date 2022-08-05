package session11.baitap.b3;

public class LazyPrimeFactorization implements Runnable {

    public boolean check(int n){
        if (n < 2) return false;
        for(int i = 2; i <=Math.sqrt(n) ; i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
     public void run() {
        int count = 0;
        try{
            while (true){
                if (check(count)) {
                    System.out.print("toi uu: " + count);
                    System.out.println();
                }
                count++;
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}