package exeptions;

public class E2Exceptions {
    public static void main(String[] args) {
        System.out.println(1);

        try{
            String name=null;
            System.out.println(name.length());
        System.out.println(10/0);
        }
        catch (NullPointerException npe){
            System.out.println("Please initialize the object");
        }
        catch (ArithmeticException e){
            System.out.println("This math operation is not allowed");
        }
        catch (Exception e){
            System.out.println("Something went wrong");
        }
        System.out.println(6);

    }
}
