package Arrays;

import java.sql.SQLOutput;

public class Values2Darray {
    public static void main(String[] args) {
        int [][]numbers={
                {1,2,3,4,5},
                {10,20,30,40,50},
                {200,400,600}

        };

        for(int[]myNumbers:numbers){

            for(int num:myNumbers){

                System.out.print(num+" ");
            }
            System.out.println();
        }

        String [][]cars={
                {"Bmw","Porsche","Audi"},
                {"Kia","Ferrari",},
                {"Fiat","Opel","Peugeot","Mercedes"},
                {"Honda","Lexus"}
        };

        for (String[]Supercars:cars){

            for(String FavoriteCars:Supercars){

                System.out.print(FavoriteCars+" ");
            }
            System.out.println();
        }


    }
}
