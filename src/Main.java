class Course {

    String courseName;
    int studentsRegistered;

    static int totalStudents = 0;

    Course(String courseName, int studentsRegistered) {
        this.courseName = courseName;
        this.studentsRegistered = studentsRegistered;
        totalStudents += studentsRegistered;
    }

    void displayCourse() {
        double passPercentage = 80.0;

        System.out.println("Course: " + courseName);
        System.out.println("Students Registered: " + studentsRegistered);
        System.out.println("Pass Percentage: " + passPercentage + "%");
        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {

        Course course1 = new Course("Java Programming", 40);
        Course course2 = new Course("Database Systems", 35);
        Course course3 = new Course("Computer Networks", 30);

        course1.displayCourse();
        course2.displayCourse();
        course3.displayCourse();

        double averageStudents = Course.totalStudents / 3.0;

        System.out.println("University Statistics");
        System.out.println("---------------------");
        System.out.println("Total Students: " + Course.totalStudents);
        System.out.println("Average Students per Course: " + averageStudents);
    }
}