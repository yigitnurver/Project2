package exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E7Exceptions {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(1);
        FileInputStream fis=null;

        try{
            fis=new FileInputStream("C:\\Users\\Yigit\\IdeaProjects\\PracticeGitHub\\Files\\config.properties");}
        catch (FileNotFoundException f){
            f.printStackTrace();
        }

        System.out.println(2);
        System.out.println(3);


    }
}
