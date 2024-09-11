package exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E6Exceptions {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(1);
        FileInputStream fis=null;

        try{
            fis=new FileInputStream("C:\\Users\\Yigit\\IdeaProjects\\PracticeGitHub\\Files\\config.properties");}
        catch (FileNotFoundException f){
            f.printStackTrace();
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(2);
        System.out.println(3);


    }
}
