package Relational;

import org.w3c.dom.ls.LSOutput;

public class IfElseStatement {
    public static void main(String[] args) {

        int score = 80;

        if (score > 70) {
            System.out.println("You are doing great job");
        } else {
            System.out.println("You are amazing");

        }

        String password = "Hello123";

        if (password.equals("Hello123")) {
            System.out.println("Pasword is correct");
        } else {
            System.out.println("Pasword is Not correct");
        }
    }
}
