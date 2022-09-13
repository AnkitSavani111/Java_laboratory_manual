/*  WAP that illustrate the interface inheritance. Interface P is extended by P1 and P2 interfaces.
    2 1,2 Interface P12 extends both P1 and P2. Each interface declares one method and one constant.
    Create one class that implements P12. By using the object of the class invokes each of its method
    and displays constant. */

// Ankit Savani (21CE122)

interface P {
    int varP = 0;
    void printP();
}

interface P1 extends P {
    int varP1 = 1;
    void printP1();
}

interface P2 extends P {
    int varP2 = 2;
    void printP2();
}

interface P12 extends P1, P2 {
    int varP12 = 12;
    void printP12();
}

class ImplementationOfP12 implements P12 {

    public void printP() {
        System.out.println("The value of variable in interface P is " + varP);
    }

    public void printP12() {
        System.out.println("The value of variable in interface P12 is " + varP12);
    }

    public void printP1() {
        System.out.println("The value of variable in interface P1 is " + varP1);
    }

    public void printP2() {
        System.out.println("The value of variable in interface P2 is " + varP2);
    }
}

public class Pr_3_3 {
    public static void main(String[] args) {
        ImplementationOfP12 objP12 = new ImplementationOfP12();
        objP12.printP();
        objP12.printP1();
        objP12.printP2();
        objP12.printP12();
    }
}