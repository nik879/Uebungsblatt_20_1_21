package Beispiel1_Mitarbeiter;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeManager {
    private ArrayList<Employee> Employees = new ArrayList<>();

    public EmployeeManager(ArrayList<Employee> employees) {
        Employees = employees;
    }

    public double calcTotalSalary() {
        double totalsum=0;
        for (Employee employee : Employees) {
            totalsum += employee.getFullsalary();
        }
        return totalsum;
    }

    public void addEmployee(Employee e) {
        Employees.add(e);
    }

    public HashMap<String, Double> getSalaryByDepartment() {
        HashMap<String, Double> DepartmentSalary = new HashMap<>();
        double salary=0.0;

        for (Employee employee : Employees) {
            if (DepartmentSalary.containsKey(employee.department)) {
                salary += employee.getFullsalary();
                DepartmentSalary.put(employee.department, salary);
            } else {
                salary = employee.getFullsalary();
                DepartmentSalary.put(employee.department, employee.getFullsalary());
            }
        }

        return DepartmentSalary;
    }

    @Override
    public String toString() {
        return "EmployeeManager{" +
                "Employees=" + Employees +
                '}';
    }
}
