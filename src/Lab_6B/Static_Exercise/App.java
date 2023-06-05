package Lab_6B.Static_Exercise;
/*

-----------------
Student
-----------------
- id : int 
- name : String
- cgpa : double
- totalStudents : int  <<underlined>>
------------------
+ Student()
+ Student(id : int, name : String, cgpa : double)
+ setId(id : int) : void
+ setName(name : String) : void
+ setCgpa(cgpa : double) : void
+ getId() : int 
+ getName() : String
+ getCgpa() : double
+ getTotalStudents() ; int <<underlined>>
+ toSting() : String

Now write a test program that performs the following steps:
* Create a student object by taking user input and print its properties
*Print the no of total created Student objects
*Create another student object using default constructor and print its properties
*Print the no of total created Student objects

 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Id: ");
        int id = sc.nextInt();

        sc.nextLine(); // Consume the newline character after reading the id

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter Cgpa: ");
        double cgpa = sc.nextDouble();

        sc.nextLine(); // Consume the newline character after reading the cgpa

        Student student1 = new Student(id, name, cgpa);

        System.out.println(student1.toString());

        System.out.println("Total Sutdeints = " + Student.getTotalStudents());

        Student student2 = new Student(2144, "Asif Ali", 3.5);

        System.out.println(student2.toString());

        System.out.println("Total Sutdeints = " + Student.getTotalStudents());
    }
}
