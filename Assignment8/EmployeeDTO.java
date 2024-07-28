package assignment8;

public class EmployeeDTO {

    private static String name;
    private static String employeeId;
    private static String department;
    private static double salary;
    private static String ssn; // PII

    public void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }

    public static void setSsn(String ssn) {
        EmployeeDTO.ssn = ssn;
    }

    public void displaySsn() {
        System.out.println("SSN: " + ssn);
    }

    public static void main(String[] args) {
        name = "Jane Smith";
        employeeId = "E12345";
        department = "IT";
        salary = 75000;
        setSsn("123-45-6789");

        EmployeeDTO employee1 = new EmployeeDTO();
        employee1.displayEmployeeDetails();
        employee1.displaySsn();
    }
}

