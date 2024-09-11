package Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][]scores=new int[3][3];
        // first row

        scores[0][0]=90;
        scores[0][1]=100;
        scores[0][2]=87;

        //2row
        scores[1][0]=89;
        scores[1][1]=99;
        scores[1][2]=98;

        //3  row

        scores[2][0]=80;
        scores[2][1]=90;
        scores[2][2]=100;

        System.out.println(scores[1][1]);
        System.out.println(scores[1][2]);
        System.out.println(scores[0][0]+scores[2][0]+scores[2][1]/3);

        int[][]numbers={
                {1,2,3,4,5},
                {10,20},
                {100,200,300}

        };




    }
}
