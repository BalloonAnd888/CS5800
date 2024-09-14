package aggregation.course;

import aggregation.instructor.Instructor;
import aggregation.textbook.Textbook;

public class Course {
    protected String name;
    protected Instructor instructor;
    protected Textbook textbook;

    public Course(String name, Instructor instructor, Textbook textbook) {
        this.name = name;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    public String getName() {
        return name;
    }

    public void print() {
        System.out.println("Course Name: " + getName() + " Instructor: " + instructor.getFirstName() + " " + instructor.getLastName() + " Office: " + instructor.getOfficeNumber() + " Textbook: " + textbook.getTitle());
    }
}
