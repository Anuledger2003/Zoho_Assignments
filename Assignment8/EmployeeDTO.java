package assignment8;

public class EmployeeDTO {

   
    private String name;
    private int employeeId;
    private String department;
    private double salary;
    private String ssn; // Personally Identifiable Information (PII)

    
    private static int employeeCount = 0;

    // Constructor
    public EmployeeDTO(String name, int employeeId, String department, double salary, String ssn) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;
        setSsn(ssn); // Use setter to apply validation or control
        employeeCount++;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSsn() {
        return "Access Denied"; // Do not directly return PII
    }

    public void setSsn(String ssn) {
        if (validateSsn(ssn)) {
            this.ssn = ssn;
        } else {
            throw new IllegalArgumentException("Invalid SSN");
        }
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }


    private boolean validateSsn(String ssn) {
        
        return ssn != null && ssn.length() == 9;
    }

 
    public static void main(String[] args) {
        EmployeeDTO employee1 = new EmployeeDTO("Alice Smith", 101, "HR", 60000, "123456789");
        EmployeeDTO employee2 = new EmployeeDTO("Bob Johnson", 102, "IT", 75000, "987654321");

        employee1.displayEmployeeDetails();
        employee2.displayEmployeeDetails();

        System.out.println("Total number of employees: " + EmployeeDTO.getEmployeeCount());

        System.out.println("SSN of employee1: " + employee1.getSsn());
    }
}
