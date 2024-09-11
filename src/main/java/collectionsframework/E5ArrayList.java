package collectionsframework;

import java.util.ArrayList;

public class E5ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Josh");
        names.add("John");
        names.add("Adam");
        names.add("Jilli");
        names.removeIf(x->x.length()>4);
        System.out.println(names);




    }
}
