public class Employee {
    private String name;
    private int birthDate;
    private double[] salaries;

    public Employee(String name, int birthDate, double[] salaries) {
        this.name = name;
        this.birthDate = birthDate;
        this.salaries = salaries;
    }

    public String getName() {
        return name;
    }



    public double[] getSalaries() {
        return salaries;
    }

    public double getAverageSalary(double[] salaries) {
        double sum = 0;
        for (double salary : this.salaries) {
            sum += salary;
        }
        return sum / this.salaries.length;
    }
}
