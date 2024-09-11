package accesmodifiers;

public class Person {
    private String name;
    String color;
    int age;

    void printName(){
        System.out.println(name);
    }
    void printColor(){
        System.out.println(color);
    }
    void printage(){
        System.out.println(age);
    }

    public static void main(String[] args) {
        Person p=new Person();
        p.name="James";
        p.color="White";
        p.age=15;

        p.printName();
        p.printColor();
        p.printage();

    }
}
