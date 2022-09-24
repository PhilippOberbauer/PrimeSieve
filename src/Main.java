import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Windows-1252");
        scanner.useDelimiter("\n");
        System.out.println("Bitte geben Sie die Obergrenze der zu berechnenden Primzahlen ein.");
        int limit = scanner.nextInt();
        EratosthenesPrimeSieve sieve = new EratosthenesPrimeSieve(limit);
        sieve.primeSieve();
        System.out.println("Primzahlen bis " + limit + ":");
        sieve.printPrimes();
    }
}