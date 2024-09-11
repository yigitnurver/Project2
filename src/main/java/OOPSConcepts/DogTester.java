package OOPSConcepts;

import java.util.Scanner;

public class DogTester {
    public static void main(String[] args) {

        Dog dog1=new Dog();

        dog1.name="Jack";
        dog1.breed="German";
        dog1.color="Black";
        dog1.age=10;

        dog1.bark();
        dog1.sleep();
        dog1.eating();

        System.out.println();


        Dog dog2=new Dog();
        dog2.name="Jerry";
        dog2.breed="Persian";
        dog2.age=12;
        dog2.color="White";
        dog2.bark();
        dog2.sleep();
        dog2.vomiting();







    }
}
