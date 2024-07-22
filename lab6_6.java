 public class lab6_6 {
    // Constants declared using final keyword
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        // Variables declared using final keyword
        final int x = 10;
        final int y;

        y = 20;

        // Trying to reassign a final variable will result in a compilation error
        // x = 30; // Uncommenting this line will result in a compilation error

        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);

        // Demonstrating final method
        FinalDemo demo = new FinalDemo();
        demo.display();
    }
}

class FinalDemo {
    // Final method which cannot be overridden in child classes
    public final void display() {
        System.out.println("Final method");
    }
}