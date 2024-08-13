package assignment4;

/*Create a Main class with a main method to test the Person class by creating objects using each constructor and 
 *printing their details.
 */
public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("ANU");
        person1.printDetails();

        Person person2 = new Person("ANU", 21);
        person2.printDetails();

        Person person3 = new Person("ANU", 21, "PERAVURANI");
        person3.printDetails();
    }
}
class Person {
    String name;
    int age;
    String address;

    public Person(String name) {
        this.name = name;
        this.age = 0;
        this.address = "Not Available";
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.address = "Not Available";
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void printDetails() {
        System.out.println("Name: " + name + "\nAge: " + age + "\nAddress: " + address);
    }
}

