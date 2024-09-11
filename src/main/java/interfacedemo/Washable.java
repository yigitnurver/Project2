package interfacedemo;

public interface Washable {

    public static final int GRAVITY=9;
    void wash();
}


class Car implements Washable{

    public void wash(){
        System.out.println("Washing the car");

    }

}

class Horse implements Washable{

    public void wash(){
        System.out.println("Washing the horse");
    }
}