package StringBuilderDemo;

public class E5StringBuilder {
    public static void main(String[] args) {

        String s="Ptyton";

        StringBuilder sb=new StringBuilder(s); // reverse the string method to "s"
        sb.reverse();
        System.out.println(sb);

        s= sb.toString(); // getting back again to the String "s" class.
        System.out.println(s);















        }
}
