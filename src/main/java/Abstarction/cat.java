package Abstarction;


public class cat extends Animal {

    cat(String name, String color, int age){
        super(name, color, age);
    }


    void speak(){
        System.out.println("Meoww meooww...");
    }

    @Override
    void eat() {
        System.out.println("Cats like to eat fish");
    }
}
