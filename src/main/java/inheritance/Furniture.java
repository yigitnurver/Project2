package inheritance;

public class Furniture {
    String color="Red";



}
class Chair extends Furniture{
    String color="Black";


    void PrintColor(){
        String color="White";
        System.out.println(color);
        System.out.println(this.color);
        System.out.println(super.color);
    }
}

class ChairTester{
    public static void main(String[] args) {
        Chair c=new Chair();
        c.PrintColor();

    }

}
