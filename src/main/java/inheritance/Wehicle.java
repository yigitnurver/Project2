package inheritance;

public class Wehicle {

    String vinNumber;
}
class Car extends Wehicle{
    String color;

    void drive(){
        System.out.println("Driving.......");
    }

}

class ElectricCar extends Wehicle{
    void drive(){
        System.out.println("no need for gas to drive");
    }

}

class Audi extends Car{

}
