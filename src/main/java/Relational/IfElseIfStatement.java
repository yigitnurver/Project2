package Relational;

public class IfElseIfStatement {
    public static void main(String[] args) {
        int score=55;

        if(score>90) {
            System.out.println("You are doing excellent job");
        }else if(score>80) {
            System.out.println("You are doing great job");
        }else if(score>45){
            System.out.println("You are doing good");
        }else if(score>60) {
            System.out.println("You are doing okey");
        }else {
            System.out.println("You need to do better");
        }
    }
}
