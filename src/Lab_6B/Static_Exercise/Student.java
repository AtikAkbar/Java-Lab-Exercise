package Lab_6B.Static_Exercise;

public class Student {
    private int id;
    private String name;
    private double cgpa;
    public static int totalStudents;

    private Student() {
        this.id = 0;
        this.name = "";
        this.cgpa = 0.0;
        totalStudents++;
    }
    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
        totalStudents++;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getCgpa() {
        return cgpa;
    }
    public static int getTotalStudents() {
        return totalStudents;
    }

    @Override
    public String toString() {
        return "Student : \n{ Id : " + this.id + "\n  Name : " + this.name + "\n  Cgpa : " + this.cgpa + "\n}";
    }
}
