package StringBuilderDemo;

public class E4StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Java");

        sb.append(10);
        sb.append(true);
        System.out.println(sb);
        sb.insert(2,'c');
        sb.insert(3,'s');

        String s= sb.toString();
        System.out.println(s);

        StringBuilder st=new StringBuilder(s);
        System.out.println(st);






        }
}
