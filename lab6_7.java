class FinalVariableExample {
    final int VALUE = 100; // final variable

    void display() {
        System.out.println("Value: " + VALUE);
    }
}

public class lab6_7 {
    public static void main(String[] args) {
        FinalVariableExample example = new FinalVariableExample();
        example.display();
    }
}