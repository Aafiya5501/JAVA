interface A {
    String CONSTANT_A = "abstract"; 
    void methodA();
}

interface A1 extends A {
}

interface A2 extends A {
}


interface A12 extends A1, A2 {
    String CONSTANT_B = "inheritance";

class B implements A12 {
   
    public void methodA() {
        System.out.println("MethodA: " + CONSTANT_A); 
    }
}

    
    public void methodB() {
        System.out.println("MethodB: " + CONSTANT_B); 
    }
}

public class Main {
    public static void main(String[] args) {
        B objB = new B();
        objA.methodA();
        objB.methodB();
        
}
    }

       
