package OOPSConcepts;

public class E8StringDemo {
    public static void main(String[] args) {
        String str="Java is easy";

        System.out.println(str.substring(8));

        String newStr=str.substring(0,4);
        System.out.println(newStr);

        String str2=str.substring(5);
        System.out.println(str2);

        String str3=str.substring(6);
        System.out.println(str3);

    }
}
