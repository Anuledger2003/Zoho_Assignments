import java.util.Scanner;
class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getEmployeeDetails() {
        return "Name: " + name;
    }
}

class HourlyEmployee extends Employee {
    private double hourlyRate;

    public HourlyEmployee(String name, double hourlyRate) {
        super(name);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String getEmployeeDetails() {
        return super.getEmployeeDetails() + ", Hourly Rate: " + hourlyRate;
    }
}

class SalariedEmployee extends Employee {
    private double annualSalary;

    public SalariedEmployee(String name, double annualSalary) {
        super(name);
        this.annualSalary = annualSalary;
    }

    @Override
    public String getEmployeeDetails() {
        return super.getEmployeeDetails() + ", Annual Salary: " + annualSalary;
    }
}

public class Employees {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
	System.out.println("Enter the HourlyEmployee : ");
	String HEname = obj.nextLine();
	System.out.println("Enter the Salary : ");
	double Hsalary = obj.nextDouble();
	System.out.println("Enter the SalariedEmployee : ");
	String SEname = obj.nextLine();
	System.out.println("Enter the Salary : ");
	double Ssalary = obj.nextDouble();

        Employee e1 = new HourlyEmployee(HEname, Hsalary);
        Employee e2 = new SalariedEmployee(SEname, Ssalary);


        System.out.println(e1.getEmployeeDetails());
        System.out.println(e2.getEmployeeDetails());
    }
}
