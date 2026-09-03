package Exercicio14;

public class Employe {
    private int id;
    private String name;
    private double salary;

    Employe(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void salaryGrowth(double percent){
        salary += salary * percent / 100.0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "ID: " + this.id + " Name: " + this.name + " Salary: " + this.salary;
    }
}
