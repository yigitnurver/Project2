package Relational;

import java.util.Scanner;

public class ScannerIntro3 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please Enter Your Birth city and State");
        String CityState=input.nextLine();
        System.out.println("My Birth City and State is "+CityState);

        System.out.println("What is your gender");
        char gender=input.next().charAt(0);
        System.out.println("My gender is "+gender);

        System.out.println("What is your salary expectation");
        double salary=input.nextDouble();
        System.out.println("Average Per year "+salary);
    }
}
