package Relational;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        System.out.println("Please enter your moms name");
        String MomsName=input.nextLine();
        System.out.println("My moms name is "+MomsName);

        System.out.println("Please enter your full name");
        String fullName=input.nextLine();
        System.out.println("Your name is "+fullName);

        System.out.println("Please enter your age");
        int age=input.nextInt();
        System.out.println("Your age is "+age);

        System.out.println("What is the Price");
        double price=input.nextDouble();
        System.out.println("The Price is "+price);

        System.out.println("Which school you are studiyng");
        String school=input.next();

        System.out.println("Please enter your grade");
        char grade=input.next().charAt(0);

        System.out.println("You are studying at "+school+ " and your grade is "+grade);

        System.out.println("Please enter your car Brand");
        String carBrand=input.next();
        System.out.println("Your car is "+carBrand);



        input.close();













    }
}
