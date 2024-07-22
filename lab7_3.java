// Transport interface
interface Transport {
    void deliver();
}

// Abstract class Animal
abstract class Animal {
    // Abstract method
    abstract void sound();
}

// Tiger class extending Animal
class Tiger extends Animal {
    // Implementation of sound method
    void sound() {
        System.out.println("Tiger: Roar");
    }
}

// Camel class extending Animal and implementing Transport interface
class Camel extends Animal implements Transport {
    // Implementation of sound method
    void sound() {
        System.out.println("Camel: Grunt");
    }

    // Implementation of deliver method from Transport interface
    public void deliver() {
        System.out.println("Camel delivers goods.");
    }
}

// Deer class extending Animal
class Deer extends Animal {
    // Implementation of sound method
    void sound() {
        System.out.println("Deer: Bellow");
    }
}

// Donkey class extending Animal and implementing Transport interface
class Donkey extends Animal implements Transport {
    // Implementation of sound method
    void sound() {
        System.out.println("Donkey: Bray");
    }

    // Implementation of deliver method from Transport interface
    public void deliver() {
        System.out.println("Donkey delivers goods.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Initialize an array of Animal objects
        Animal[] animals = {new Tiger(), new Camel(), new Deer(), new Donkey()};

        // Loop through the array and invoke deliver method if the object implements Transport interface
        for (Animal animal : animals) {
            if (animal instanceof Transport) {
                ((Transport) animal).deliver();
            }
        }
    }
}