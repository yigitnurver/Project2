package Abstarction;


public class Dog extends Animal {
    Dog(String name, String color, int age){
        super(name,color,age);
    }

    @Override
    void eat() {
        System.out.println("WUUff Wuuuff");
    }

    void speak(){
        System.out.println("wuuff wuuff");
    }

}
