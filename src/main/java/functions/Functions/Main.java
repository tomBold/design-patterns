package functions.Functions;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String args[]) {
        List<Employee> employeeList =
                Arrays.asList(new Employee("Tom Jones", 45),
                        new Employee("Harry Major", 25),
                        new Employee("Ethan Hardy", 65),
                        new Employee("Nancy Smith", 15),
                        new Employee("Deborah Sprightly", 29));

       // EmployeeMananger.print(employeeList);

        EmployeeMananger.id(employeeList);


    }
}
