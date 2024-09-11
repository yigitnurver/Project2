package Methods;

import java.sql.SQLOutput;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.name="Asghar Nazir";
        e1.salary=-2000;
        e1.bark();



        Employee e2=new Employee();
        e2.name="Moazzam";
        e2.salary=1150000;
        e2.bark();



        System.out.println(e1.CEO);
        System.out.println(e2.CEO);
        System.out.println(Employee.CEO);
        System.out.println(e1.name);
        System.out.println(e2.name);
        Employee.printCEO();






    }
}
