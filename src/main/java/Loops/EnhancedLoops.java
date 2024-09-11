package Loops;

public class EnhancedLoops {
    public static void main(String[] args) {
        int[]ages={12,15,17,89,58,18};

        for (int i = 0; i < ages.length; i++) {

            if(ages[i]%2==0){
                continue;
            }
            System.out.println(ages[i]);

        }






    }
}
