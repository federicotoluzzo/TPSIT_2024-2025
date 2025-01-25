package threads2;

public class Main {
    public static void main(String[] args) {
        long start = System.nanoTime();
        PrimeCalculator pc = new PrimeCalculator(1, 1000000);
        pc.run();
        System.out.println("Total time multithreaded: " + (System.nanoTime() - start));
    }
}
