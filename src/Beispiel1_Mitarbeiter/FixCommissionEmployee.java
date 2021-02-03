package Beispiel1_Mitarbeiter;

public class FixCommissionEmployee extends Employee {

    protected double additionalCommission;

    public FixCommissionEmployee(String firstname, String lastname, String department, double baseSalary, double additionalCommission) {
        super(firstname, lastname, department, baseSalary);
        this.additionalCommission = additionalCommission;
    }

    @Override
    public double getFullsalary() {
        return super.getFullsalary()+additionalCommission;
    }


}
