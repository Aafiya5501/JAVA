
public class OddEvenPrinter {
    public static void main(String[] args) {
        // Create instances of the two Runnable classes
        Runnable oddPrinter = new OddNumberPrinter();
        Runnable evenPrinter = new EvenNumberPrinter();

        // Create threads for each Runnable
        Thread oddThread = new Thread(oddPrinter);
        Thread evenThread = new Thread(evenPrinter);

        // Start the threads
        oddThread.start();
        evenThread.start();
    }

    // Runnable class to print odd numbers
    static class OddNumberPrinter implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 20; i += 2) {
                System.out.println("Odd: " + i);
                try {
                    Thread.sleep(500); // Sleep for a short time to stagger output
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Runnable class to print even numbers
    static class EvenNumberPrinter implements Runnable {
        @Override
        public void run() {
            for (int i = 2; i <= 20; i += 2) {
                System.out.println("Even: " + i);
                try {
                    Thread.sleep(500); // Sleep for a short time to stagger output
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
