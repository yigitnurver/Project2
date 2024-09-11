package collectionsframework;

import java.util.ArrayList;

public class E4ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names1=new ArrayList<>();
        names1.add("Josh");
        names1.add("John");
        names1.add("Adam");
        names1.add("Jilli");
        System.out.println(names1.size());

        for(String n:names1){
            System.out.println(n);
        }
        System.out.println("=========");

        for (int i = 0; i < names1.size(); i++) {
            System.out.println(names1.get(i));
        }
        System.out.println("===============");


        names1.forEach(x-> System.out.println(x));


    }
}
