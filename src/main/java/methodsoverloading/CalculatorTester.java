package methodsoverloading;

public class CalculatorTester {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        c.add(10,20);
        c.add(20.5,10.5);
        c.add(10,20.47);

    }
}
