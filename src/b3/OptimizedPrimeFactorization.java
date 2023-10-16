package b3;

public class OptimizedPrimeFactorization implements Runnable {
    @Override
    public void run() {
        for (int i = 2; ; i++) {
            if (isPrime(i)) {
                System.out.println("Optimized Prime: " + i);
            }
        }
    }

    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
