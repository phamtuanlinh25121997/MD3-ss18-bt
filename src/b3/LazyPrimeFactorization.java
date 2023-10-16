package b3;

public class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        for (int i = 2; ;i++) {
            if (isPrime(i)) {
                System.out.println("Lazy Prime :" + i);
            }
        }
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}