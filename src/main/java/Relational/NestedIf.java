package Relational;

public class NestedIf {
    public static void main(String[] args) {

        boolean shipped=true;
        boolean delivered=false;

        if (shipped) { // outer if
            System.out.println("Order has been shipped");

            if (delivered) { // nested if
                System.out.println("Product has been delivered");
            }else {
                System.out.println("Product is in transit");
            }


        }else {
            System.out.println("Product has not been shipped yet");
        }
    }
}
