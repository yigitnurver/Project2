package inheritance;

import Methods.dog;

public class AnimalTester {
    public static void main(String[] args) {
        cat c=new cat("Mamo","Black",12);


        c.speak();
        c.printInfo();





        Dog d=new Dog("Jacky","White",15);
        d.speak();
        d.printInfo();
        d.eat();


    }
}
