package Loops;

import java.util.Scanner;

public class LoopTrainig {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Please enter your level");
        int Level=input.nextInt();

        switch(Level){
            case(20):
                System.out.println("You need More experience ");
                break;
            case(40):
                System.out.println("You getting better");
                break;
            case(60):
                System.out.println("You need to open Master");
                break;
            default:
                System.out.println("Invalid Level");
        }


    }
}
