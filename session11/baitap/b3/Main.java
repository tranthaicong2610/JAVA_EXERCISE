package session11.baitap.b3;

public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization();
        OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization();
        Thread t1 = new Thread(lazyPrimeFactorization);
        Thread t2 = new Thread(optimizedPrimeFactorization);
        t1.start();
        t2.start();
    }
}
