import java.util.stream.IntStream;

public class Primes {
    public static void main(String[] args) {
        IntStream.range(2,101)
                .filter(Primes::isPrime)
                .forEach(System.out::println);
    }

    private static boolean isPrime(int n){
        if (n % 2 == 0) return false;
        return IntStream.iterate(3, i -> i + 2)
                .takeWhile(i -> i * i <= n)
                .noneMatch(i -> n % i == 0);
    }
}