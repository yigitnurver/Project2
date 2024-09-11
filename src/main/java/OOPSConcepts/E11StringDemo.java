package OOPSConcepts;

public class E11StringDemo {
    public static void main(String[] args) {
        String str="Java is easy. Java is fun";
        String[]strArray=str.split("[i]");
        System.out.println(strArray.length);

        for(String s:strArray){
            System.out.println(s.trim());
        }





    }
}
