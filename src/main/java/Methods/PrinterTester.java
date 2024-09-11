package Methods;

public class PrinterTester {
    public static void main(String[] args) {

        Printer printer=new Printer();



        printer.printMany("java",10);



        int sum=printer.add(15,30);
        System.out.println(sum);

        boolean reslts=printer.isEven(10);
        System.out.println(reslts);


        int[]arr={10,20,30};

        int sumofArray=printer.sumArray(arr);
        System.out.println(sumofArray);

        System.out.println(Employee.CEO);

    }

}
