package Relational;

public class MoreIfElseIfExamples {
    public static void main(String[] args) {

        String language="Japan";

        if(language.equals("English")) {
            System.out.println("Hello");
        } else if(language.equals("Spanish")) {
            System.out.println("Hola");
        }else if(language.equals("French")) {
            System.out.println("Bonjour");
        }else if (language.equals("Italian")) {
            System.out.println("Ciao");
        }else {
            System.out.println("I dont know how to greet you");
        }


    }
}
