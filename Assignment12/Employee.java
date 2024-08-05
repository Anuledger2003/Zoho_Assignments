package assignment12;

/*
 1. Change Employee class as abstract and add abstract methods like 
 	calculatePay() with concrete methods like getEmployeeDetails(), etc. 
 	Extend this abstract class in subclasses - HourlyEmployee and 
 	SalariedEmployee. Allow the user to input details of employees and 
 	calculate their respective pay using the abstract class reference.
 */
import java.util.Scanner;

abstract class Employees {
 protected String name;
 protected String id;

 public Employees(String name, String id) {
     this.name = name;
     this.id = id;
 }

 public void getEmployeeDetails() {
     System.out.println("Name: " + name);
     System.out.println("ID: " + id);
 }

 public abstract double calculatePay();

 public String getRole() {
     return this.getClass().getSimpleName();
 }

 public void printWelcomeMessage() {
     System.out.println("Welcome, " + name + "!");
 }
}

//HourlyEmployee 
class HourlyEmployee extends Employees {
 private double hourlyRate;
 private int hoursWorked;

 public HourlyEmployee(String name, String id, double hourlyRate, int hoursWorked) {
     super(name, id);
     this.hourlyRate = hourlyRate;
     this.hoursWorked = hoursWorked;
 }

 public double calculatePay() {
     return hourlyRate * hoursWorked;
 }
}

//SalariedEmployee 
class SalariedEmployee extends Employees {
 private double annualSalary;

 public SalariedEmployee(String name, String id, double annualSalary) {
     super(name, id);
     this.annualSalary = annualSalary;
 }

 public double calculatePay() {
     return annualSalary / 12; 
 }
}

//Main class 
public class Employee {
 public static void main(String[] args) {
     Scanner obj = new Scanner(System.in);

     System.out.println("Enter type of employee (Hourly/Salaried): ");
     String type = obj.nextLine();

     System.out.println("Enter name: ");
     String name = obj.nextLine();

     System.out.println("Enter ID: ");
     String id = obj.nextLine();

     Employees employee = null;

     if (type.equalsIgnoreCase("Hourly")) {
         System.out.println("Enter hourly rate: ");
         double hourlyRate = obj.nextDouble();

         System.out.println("Enter hours worked: ");
         int hoursWorked = obj.nextInt();

         employee = new HourlyEmployee(name, id, hourlyRate, hoursWorked);
     } else if (type.equalsIgnoreCase("Salaried")) {
         System.out.println("Enter annual salary: ");
         double annualSalary = obj.nextDouble();

         employee = new SalariedEmployee(name, id, annualSalary);
     } else {
         System.out.println("Invalid employee type");
         System.exit(1);
     }

     employee.getEmployeeDetails();
     System.out.println("Calculated Pay: " + employee.calculatePay());
     System.out.println("Role: " + employee.getRole());
     employee.printWelcomeMessage();
 }
}
