package OOPSConcepts;

import java.sql.SQLOutput;

public class E7StringDemo {
    public static void main(String[] args) {
        String str="Hello Syntax";
        System.out.println(str.indexOf('S'));
        System.out.println(str.indexOf('a'));

        System.out.println("--------------");

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='l'){
                System.out.println(i);
            }
        }
    }

}
