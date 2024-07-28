package assignment10;

public class ZSGSStudent extends Student {
    public String course;
    public int year;

    public ZSGSStudent(String name, int age, String course, int year) {
        super(name, age); 
        this.course = course;
        this.year = year;
    }

    public ZSGSStudent(String name, String course, int year) {
        super(name); 
        this.course = course;
        this.year = year;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Course: " + course);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
    
        ZSGSStudent student1 = new ZSGSStudent("Anu", 21, "Computer Science", 3);
        student1.displayDetails();

        ZSGSStudent student2 = new ZSGSStudent("Maha", "Electrical Engineering", 2);
        student2.displayDetails();

        Student student3 = new Student("Charlie", 25);
        student3.displayDetails();
    }
}
