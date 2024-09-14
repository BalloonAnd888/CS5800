package aggregation;

import aggregation.course.Course;
import aggregation.textbook.Textbook;
import aggregation.instructor.Instructor;

public class Main {
    public static void main(String[] args) {
        Course[] courses = new Course[3];

        courses[0] = new Course("CS5800", new Instructor("Nima", "Davarpanah", "3-2636"), new Textbook("Clean Code", "Robert Cecil Martin", "Pearson"));

        courses[1] = new Course("CS2230", new Instructor("John", "Oates", "1-367"), new Textbook("Python Crash Course", "Eric Matthes", "No Starch Press"));

        courses[2] = new Course("CS4840", new Instructor("William", "McCarthy", "4-001"), new Textbook("Ray Tracing", "Kevin Suffern", "CRC Press"));
        
        for (Course course : courses) {
            course.print();
        }
    }
}
