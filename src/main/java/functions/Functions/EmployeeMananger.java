package functions.Functions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeMananger {
    public static void print(List<Employee> arr) {
        System.out.println("Employee list: ");
        arr.forEach(System.out::println);
    }

    public static void apply(List<Employee> arr) {
        Function<Employee, String> funcEmpToString = (Employee e) -> {
            return e.getName();
        };
        List<String> result = convertEmpListToNamesList(arr, funcEmpToString);
        result.forEach(System.out::println);
    }

    public static List<String> convertEmpListToNamesList(List<Employee> employeeList, Function<Employee, String> funcEmpToString) {
        List<String> empNameList = new ArrayList<String>();
        for (Employee emp : employeeList) {
            empNameList.add(funcEmpToString.apply(emp));
        }

        return empNameList;
    }

    public static void andThan(List<Employee> arr) {
        Function<Employee, String> funcEmpToString = (Employee e) -> {
            return e.getName();
        };
        Function<String, String> initialFunction = (String s) -> s.substring(0, 1);
        List<String> result = convertEmpListToNamesListThan(arr, funcEmpToString.andThen(initialFunction));
        result.forEach(System.out::print);
    }

    public static List<String> convertEmpListToNamesListThan(List<Employee> arr, Function<Employee, String> funcEmpToString) {
        return arr.stream().map(x -> funcEmpToString.apply(x) + " ").collect(Collectors.toList());
    }

    public static void compose(List<Employee> arr) {
        Function<Employee, String> funcEmpToString = (Employee e) -> {
            return e.getName();
        };

        Function<Employee, Employee> funcEmpFirstName = (Employee e) -> {
            return new Employee(e.getName().substring(0, e.getName().indexOf(" ")), 0);
        };

        List<String> result = convertEmpListToNamesListThan(arr, funcEmpToString.compose(funcEmpFirstName));

        result.forEach(System.out::println);
    }

    public static void id(List<Employee> arr) {
        Function<Employee, String> funcEmpToString = (Employee e) -> {
            return e.getName();
        };
        List<Employee> result = iddo(arr, Function.identity());
        result.forEach(System.out::println);
    }

    public static List<Employee> iddo(List<Employee> employeeList, Function<Employee, Employee> funcEmpToString) {
        List<Employee> empNameList = new ArrayList<Employee>();
        for (Employee emp : employeeList) {
            empNameList.add(funcEmpToString.apply(emp));
        }

        return empNameList;
    }


}
