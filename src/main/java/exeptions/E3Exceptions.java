package exeptions;

public class E3Exceptions {
    public static void main(String[] args) {

        System.out.println("My name is yigit");
        System.out.println("My last name is nurver");
        System.out.println("And I'm Trying find out some problems about exceptions");


        int[]arr=new int[5];
        try{
        System.out.println(arr[10]);}
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            arrayIndexOutOfBoundsException.printStackTrace();
        }

        System.out.println("finally I got it ");
        System.out.println("everything is going so normal ");
        System.out.println("and I love this try catch block system ");
        System.out.println("This technique so efficent though");
    }
}
