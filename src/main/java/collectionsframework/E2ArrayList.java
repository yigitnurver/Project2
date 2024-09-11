package collectionsframework;


import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {
        ArrayList<String>names1=new ArrayList<>();
        names1.add("Josh"); //0
        names1.add("John"); //1
        names1.add("Adam"); //2
        names1.add("Jilli"); //3
        //names.clear();
        System.out.println(names1);
        names1.set(1,"Julia");
        System.out.println(names1);
        System.out.println(names1.indexOf("Adam"));
        System.out.println(names1.isEmpty());
        names1.remove("Adam");
        System.out.println(names1);

        ArrayList<String>names2=new ArrayList<>();
        names2.add("Sara"); //0
        names2.add("Joni"); //1
        names2.add("Black"); //2
        names2.add("Jush"); //3

        ArrayList<String>allNames=new ArrayList<>();
        allNames.addAll(names2);
        allNames.addAll(names1);
        System.out.println(allNames.remove(4));
        allNames.removeAll(names2);
        System.out.println(allNames);
        allNames.addAll(names2);
        System.out.println(allNames);
        allNames.removeAll(names1);
        System.out.println(allNames);



    }
}
