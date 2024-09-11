package inheritance;

public class Dog extends Animal {
    Dog(String name,String color,int age){
        super(name,color,age);
    }


    void speak(){
        System.out.println("wuuff wuuff");
    }
    void eat(){
        System.out.println("Dogs can eat bones");
    }

}
