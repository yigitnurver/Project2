package constructors;

public class Dog {
    private String name;

    private String color;

    private int age;

    public Dog(String dName,String dColor,int dAge){
        name=dName;
        color=dColor;

        if(dAge>50){
            System.out.println("please enter proper age");
        }else{
            age=dAge;
        }

    }
    void printInfo(){
        System.out.println(name+color+age);
    }


}
