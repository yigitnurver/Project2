package inheritance;

public class cat extends Animal{

    cat(String name,String color,int age){
        super(name, color, age);
    }


    void speak(){
        System.out.println("Meoww meooww...");
    }




}
