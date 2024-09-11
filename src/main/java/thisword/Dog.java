package thisword;

public class Dog {
    private String name;

    String breed;

    private String color;


    private int age;

    private double weight;

    public Dog(String name){
        this.name=name;
    }
    void Printnameee(){
        System.out.println(this.name);
    }


    public Dog(String name,String color){
        this.name=name;
        this.color=color;
    }
    void doginformation(){
        System.out.println(this.name+this.color+this.weight+this.age+this.breed);
    }

    public Dog(String color,String name,String breed){
        this.name=name;
        this.color=color;
        this.breed=breed;
    }




    public Dog(String name,String color,String breed,int age,double weight){
        this.name=name;
        this.color=color;
        this.age=age;
        this.breed=breed;
        this.weight=weight;
    }
    void printName(){
        System.out.println(name);
    }

    void printInfo(){
        String name="Jimi";
        String color="Green";
        int age=15;
        System.out.println(this.name+this.color+this.age+this.weight+this.breed+ " ");
    }
}
