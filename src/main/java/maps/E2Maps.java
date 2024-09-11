package maps;

import java.util.HashMap;

public class E2Maps {
    public static void main(String[] args) {
        HashMap<String,Integer>fruit=new HashMap<>();
        fruit.put("Apple",2);
        fruit.put("Orange",4);
        fruit.put("Mango",5);
        fruit.put("Kiwi",7);
        fruit.forEach((x,y)-> System.out.println(x+" "+y));
        fruit.forEach((x,y)-> System.out.println(x));
        fruit.forEach((x,y)-> System.out.println(y));
        System.out.println("=================");
        fruit.forEach((x,y)-> {

            if(y>3){
            System.out.println(y);}

        });


        //fruit.entrySet().removeIf(x->x.getKey().contains("a"));
        //fruit.entrySet().removeIf(x->x.getValue()>3);
        fruit.entrySet().removeIf(x->x.getValue()>3||x.getKey().contains("a"));
        System.out.println(fruit);




    }
}
