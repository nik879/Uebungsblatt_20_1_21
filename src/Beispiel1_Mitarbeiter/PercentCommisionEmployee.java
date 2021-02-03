package Beispiel1_Mitarbeiter;

public class PercentCommisionEmployee extends Employee {
    protected double percentCommision;

    public PercentCommisionEmployee(String firstname, String lastname, String department, double baseSalary, double percentCommision) {
        super(firstname, lastname, department, baseSalary);
        this.percentCommision = percentCommision;
    }

    @Override
    public double getFullsalary() {
        return super.getFullsalary()+(super.getFullsalary()*percentCommision)/100.0;
    }
}
