package Arrays;

public class AllValues2DARRAY {
    public static void main(String[] args) {

        int[][] numbers= {
                {1,2,3,4,5},
                {10,20,30,40,50},
                {200,400,600}


        };



        for (int row = 0; row < numbers.length; row++) {

            for (int col = 0; col < numbers[row].length; col++) {

                System.out.print(numbers[row][col]+" ");
                
            }
            System.out.println();
        }

    }
}
