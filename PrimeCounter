public class PrimeCounter {

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] array = { 2, 3, 4, 5, 6, 7, 9 };
        int primeCount = 0;

        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            if (isPrime(num)) {
                primeCount++;
            }
        }

        System.out.println("Number of prime numbers: " + primeCount);
    }
}
