package main.java.mihail_metel.homeWork03.homeWork033;

/*You need to create following structure of the classes.

        Class Course with fields: Date startDate, String name, int hoursDuration, String teacherName.
        Create two constructors with fields startDate, name; and hourseDuration, name, teacherName.

        Class Student with fields: String firstName, String lastName, int group, Course[] coursesTaken,
        int age.
        With 2 constructors firstName, lastName, group; and lastName, coursesTaken.

        CollegeStudent that is a child of Student. With additional fields: String collegeName, int rating, long id.
        Create three constructors: two the same as in Student and one with all the fields of the class.

        Class SpecialStudent that is child of CollegeStudent. With additional fields long secretKey, String email.
        Create three constructors: two the same as in CollegeStudend and one with secretKey field.

        Create getters and setters for all fields and make fields private as OOP principle follows.
        Create 5 objects Course class. Create objects of others classes using every constructor.
        You must have 13 objects in Solution class.
*/

public class Student {
    private String firstName;
    private String lastName;
    private  int group;
    private Course[] coursesTaken;
    private int age;

    public Student(String firstName, String lastName, int group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    public Student(String lastName, Course[] coursesTaken) {
        this.lastName = lastName;
        this.coursesTaken = coursesTaken;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public Course[] getCoursesTaken() {
        return coursesTaken;
    }

    public void setCoursesTaken(Course[] coursesTaken) {
        this.coursesTaken = coursesTaken;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
