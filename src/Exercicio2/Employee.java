package Exercicio2;

public class Employee {
    public String name;
    public double salary;
    public double tax;

    public double netSalary() {
        return salary - tax;
    }

    public double increaseSalary(double percentage) {
        return netSalary() * (1 + (percentage / 100.0));
    }

    @Override
    public String toString() {
        return "Employee: " + name + ", $ " + String.format("%.2f", netSalary());
    }
}