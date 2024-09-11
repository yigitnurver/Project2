package StringBuilderDemo;

public class E3StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Java");
        sb.deleteCharAt(1);
        System.out.println(sb);
        sb.append(10);
        System.out.println(sb);




        }
}
