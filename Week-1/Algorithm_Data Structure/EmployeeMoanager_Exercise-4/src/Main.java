

import com.example.employees.*;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(10);

        Employee emp1 = new Employee(1, "Alice", "Manager", 75000);
        Employee emp2 = new Employee(2, "Bob", "Developer", 50000);
        Employee emp3 = new Employee(3, "Charlie", "Analyst", 60000);

        manager.addEmployee(emp1);
        manager.addEmployee(emp2);
        manager.addEmployee(emp3);

        System.out.println("All Employees:");
        manager.traverseEmployees();

        System.out.println("\nSearching for Employee with ID 2:");
        Employee searchedEmployee = manager.searchEmployee(2);
        System.out.println(searchedEmployee);

        System.out.println("\nDeleting Employee with ID 2:");
        manager.deleteEmployee(2);
        manager.traverseEmployees();
    }
}
