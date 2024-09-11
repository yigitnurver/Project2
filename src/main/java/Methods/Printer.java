package Methods;

public class Printer {

    void print(){
        System.out.println("Hello JAVA");
    }

    void howhow(String hohow){
        System.out.println(hohow);
    }
    
    void printMany(String word,int n){
        for (int i = 0; i < n; i++) {
            System.out.println(word);
            
        }
    }

    int add(int a,int b){
        return a+b;
    }

    boolean isEven(int number){
        if(number%2==0){
            return true;
        }else{
            return false;
        }

        }

        int sumArray(int[]arr){
        int sum=0;
        for (int n:arr){
            sum=sum+n;

        }
        return sum;
    }

}
