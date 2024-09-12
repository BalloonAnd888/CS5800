package aggregation;

class Instructor {
    private String firstName;
    private String lastName;
    private String officeNumber;

    Instructor(String firstName, String lastName, String officeNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.officeNumber = officeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }
}

class Textbook {
    private String title;
    private String author;
    private String publisher;

    Textbook(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }
}

class Course {
    private String name;
    private Instructor instructor;
    private Textbook textbook;

    Course(String name, Instructor instructor, Textbook textbook) {
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

public class Main {
    public static void main(String[] args) {
        System.out.println("Aggregation");

        Instructor instructor1 = new Instructor("John", "Doe", "123");
        Textbook textbook1 = new Textbook("John", "Doe", "123");
        Course course = new Course("CS5800", instructor1, textbook1);

        course.print();
    }
}
