package Relational;

public class MoreIfElseIfExamples2 {
    public static void main(String[] args) {

        String language="FrencH";
        if(language.equalsIgnoreCase("English")) {
            System.out.println("Hello");
        }else if(language.equalsIgnoreCase("Spanish")) {
            System.out.println("Hola");
        }else if(language.equalsIgnoreCase("French")) {
            System.out.println("Bonjour");
        }else if(language.equalsIgnoreCase("Italian")){
            System.out.println("Ciao");
        }else {
            System.out.println("I do not no how is it work");
        }


    }

}
