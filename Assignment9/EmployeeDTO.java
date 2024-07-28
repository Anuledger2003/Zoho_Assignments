package assignment9;

import java.util.ArrayList;

public class EmployeeDTO {
    private String name;
    private String employeeId;
    private String department;
    private double salary;
    private String ssn; // PII

    public EmployeeDTO(String name, String employeeId, String department, double salary, String ssn) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;
        this.ssn = ssn;
    }

    public void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }

    public void displaySsn() {
        System.out.println("SSN: " + ssn);
    }

    public static void main(String[] args) {
        ArrayList<EmployeeDTO> employees = new ArrayList<>();
        
        employees.add(new EmployeeDTO("Jane Smith", "E12345", "IT", 75000, "123-45-6789"));
        employees.add(new EmployeeDTO("John Doe", "E67890", "HR", 65000, "987-65-4321"));
        
        for (EmployeeDTO employee : employees) {
            employee.displayEmployeeDetails();
            employee.displaySsn();
            System.out.println();
        }
    }
}

