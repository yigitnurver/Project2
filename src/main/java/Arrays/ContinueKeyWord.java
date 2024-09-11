package Arrays;

public class ContinueKeyWord {
    public static void main(String[] args) {

        int[]ages={10,12,15,19,20,25,32};

        for(int i=0; i< ages.length; i++){

            if(ages[i]%2==0){
                continue;
            }
            System.out.println(ages[i]);
        }



    }
}
