package Beispiel1_Mitarbeiter;

import java.util.ArrayList;

public class DemoEmployee {
    public static void main(String[] args) {
        FixCommissionEmployee Niki = new FixCommissionEmployee("Niki", "Kachelmaier", "IT", 5000 ,1000);
        System.out.println("Niki = " + Niki);
        System.out.println("Niki.getFullsalary() = " + Niki.getFullsalary());
        System.out.println("----------------------------------");

        PercentCommisionEmployee Hannes = new PercentCommisionEmployee("Hannes", "Temmel", "IT", 18000, 10);
        PercentCommisionEmployee Hannes2 = new PercentCommisionEmployee("Hannes", "Temmel", "IT", 18000, 10);
        System.out.println("Hannes = " + Hannes);
        System.out.println("----------------------------------");
        System.out.println("Hannes.getFullsalary() = " + Hannes.getFullsalary());
        System.out.println("Niki.getFullsalary() = " + Niki.getFullsalary());

        ArrayList<Employee> Mitarbeiter = new ArrayList<>();

        Mitarbeiter.add(Niki);
        Mitarbeiter.add(Hannes);
        Mitarbeiter.add(Hannes2);

        EmployeeManager em = new EmployeeManager(Mitarbeiter);
        System.out.println("em.calcTotalSalary() = " + em.calcTotalSalary());
        System.out.println("----------------------------------");

        FixCommissionEmployee Konsul = new FixCommissionEmployee("Konsul", "", "IT", 840000, 8000);
        FixCommissionEmployee Konsul2 = new FixCommissionEmployee("Konsul", "", "IT", 840000, 8000);
        Employee Konsul3 = new Employee("Konsul", "", "Dogschool", 840000);

        em.addEmployee(Konsul);
        em.addEmployee(Konsul2);
        em.addEmployee(Konsul3);
        System.out.println(em);

        System.out.println("----------------------------------");
        System.out.println(em.getSalaryByDepartment());
    }
}
