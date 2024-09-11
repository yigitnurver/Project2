package Abstarction;


public class AnimalTester {
    public static void main(String[] args) {
        cat c=new cat("Mamo","Black",12);


        c.speak();
        c.printInfo();
        c.eat();


        Dog d=new Dog("Jacky","White",15);
        d.speak();
        d.printInfo();
        c.eat();


    }
}
