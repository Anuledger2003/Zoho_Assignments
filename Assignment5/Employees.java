package assignment5;
/*
 * Add getEmployeeDetails method to the class 'Employee' and extend it in subclasses representing 
 * different types of employees such as HourlyEmployee and SalariedEmployee and overload getEmployeeDetails. 
 * Demonstrate polymorphism by printing various types of Employees by using Parent Class reference.
 */
public class Employees {
	
    String name;

    public Employees(String name) {
        this.name = name;
    }

    public String getEmployeeDetails() {
        return "Name: " + name;
    }
    
    public static void main(String[] args) {
        
        Employees e1 = new HourlyEmployee("ANU", 120);
        Employees e2 = new SalariedEmployee("SUBHA", 400000);


        System.out.println(e1.getEmployeeDetails());
        System.out.println(e2.getEmployeeDetails());
    }
}

class HourlyEmployee extends Employees {
	
    float hourlyRate;

    public HourlyEmployee(String name, float hourlyRate) {
        super(name);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String getEmployeeDetails() {
        return super.getEmployeeDetails() + ", Hourly Rate: " + hourlyRate;
    }
}

class SalariedEmployee extends Employees {
	
    float annualSalary;

    public SalariedEmployee(String name, float annualSalary) {
        super(name);
        this.annualSalary = annualSalary;
    }

    @Override
    public String getEmployeeDetails() {
    	
        return super.getEmployeeDetails() + ", Annual Salary: " + annualSalary;
    }
}


