package Loops;

import java.util.Scanner;

public class LoopAndScanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter how many numbers you'd like");
        int count=scan.nextInt();
        int sum=0;

        for(int i=1; i<=count; i++) {

            System.out.println("Please enter a number");
            sum=sum+scan.nextInt();

        }

        System.out.println("The sum of all numbers = "+sum);

    }
}
