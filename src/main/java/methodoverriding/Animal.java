package methodoverriding;

public class Animal {
    void speak(){
        System.out.println("Animals speak");
    }

    void eat(){
        System.out.println("Animals Eat");

    }

}

class Dog extends Animal{
    void speak(){
        System.out.println("wuff wuufff");
    }

    void eat(){
        System.out.println("Dogs like to eat bones");
    }

}

class Cat extends Animal{
    void speak(){
        System.out.println("Meooww Meeooww");
    }

    void eat(){
        System.out.println("Dogs like to eat bones");
    }
}


class Horse extends Animal{

    void speak(){
        System.out.println("Neigh Neigh");
    }

    void eat(){
        System.out.println("Dogs like to eat grass");
    }
}






