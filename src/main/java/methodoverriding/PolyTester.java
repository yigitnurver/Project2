package methodoverriding;



public class PolyTester {
    public static void main(String[] args) {

        Dog d=new Dog();
        d.speak();
        d.eat();

        Cat c=new Cat();
        c.eat();
        c.speak();

        Horse h=new Horse();
        h.eat();
        h.speak();


        Animal a=new Dog();
        Animal cA=new Cat();
        Animal hA=new Horse();

        Animal []arr={new Dog(),new Cat(),new Horse()};
        //Animal []arr={d,c,h};

        for (int i = 0; i < arr.length; i++) {
            Animal an=arr[i];
            an.eat();
            an.speak();

        }


    }
}
