package Arrays;

public class BreakKeyword {
    public static void main(String[] args) {
        String[]wifesname={"Jocelyn","Jessica","Jeylin"};

        for(String wifess:wifesname){
            System.out.println(wifess);

            if(wifess.equals("Jessica")){
                break;
            }
        }

    }
}
