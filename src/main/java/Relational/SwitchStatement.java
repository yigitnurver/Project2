package Relational;

public class SwitchStatement {
    public static void main(String[] args) {

        String StudentName="James" ;

        switch (StudentName) {
            case"apo":
                System.out.println("This is not proper person");
                break;
            case"Jaqualine":
                System.out.println("This is also not proper person");
                break;
            case"james":
                System.out.println("That is what I am talking about the student");
            default:
                System.out.println("None of this student right here");
                break;

        }

    }
}
