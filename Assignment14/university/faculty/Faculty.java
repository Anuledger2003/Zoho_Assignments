package university.faculty;

public class Faculty {
    private String name;
    private String facultyId;
    private String department;

    public Faculty(String name, String facultyId, String department) {
        this.name = name;
        this.facultyId = facultyId;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getFacultyId() {
        return facultyId;
    }

    public String getDepartment() {
        return department;
    }
}

