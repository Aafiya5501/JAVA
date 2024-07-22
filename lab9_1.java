public class GreetingApp {
    public static void main(String[] args) {
        // Create two instances of Runnable implementing classes
        Runnable morningGreeting = new MorningGreeting();
        Runnable afternoonGreeting = new AfternoonGreeting();

        // Create threads for each Runnable
        Thread morningThread = new Thread(morningGreeting);
        Thread afternoonThread = new Thread(afternoonGreeting);

        // Start the threads
        morningThread.start();
        afternoonThread.start();
    }

    // Runnable class for displaying "Good Morning" message
    static class MorningGreeting implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("Good Morning");
                    Thread.sleep(1000); // Sleep for 1000 milliseconds
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Runnable class for displaying "Good Afternoon" message
    static class AfternoonGreeting implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("Good Afternoon");
                    Thread.sleep(3000); // Sleep for 3000 milliseconds
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
