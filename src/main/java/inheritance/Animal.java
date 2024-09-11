package inheritance;

public class Animal {
    String name;

    String color;

    int age;

    Animal(String name,String color,int age){
        this.name=name;
        this.color=color;
        this.age=age;
    }

    void printInfo(){
        System.out.println(name+" "+color+" "+age);
    }
}
