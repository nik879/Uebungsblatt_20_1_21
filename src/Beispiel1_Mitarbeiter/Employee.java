package Beispiel1_Mitarbeiter;

public class Employee {
    protected String firstname, lastname, department;
    protected double baseSalary;

    public Employee(String firstname, String lastname, String department, double baseSalary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.department = department;
        this.baseSalary = baseSalary;
    }

    public double getFullsalary() {
        return baseSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", department='" + department + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
