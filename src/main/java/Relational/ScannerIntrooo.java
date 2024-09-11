package Relational;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerIntrooo {
    public static void main(String[] args) {
        // create Scanner
        Scanner input=new Scanner(System.in);

        System.out.println("Please enter your full name");
        String fullName=input.nextLine();
        System.out.println("Your name is "+fullName);

        System.out.println("Please enter your age");
        int age=input.nextInt();
        System.out.println("Your age is "+age);

        System.out.println("Which school you are currently studying");
        String school=input.next();

        System.out.println("Please enter your grade");
        char grade=input.next().charAt(0);

        System.out.println("You are studying at "+school+ " and your grade is "+grade);

        System.out.println("Are you enjoying classes at "+school+ " Please enter true/false");
        boolean enjoying=input.nextBoolean();

        System.out.println("I am enjoying classes at "+school+" : "+enjoying);



















    }
}
