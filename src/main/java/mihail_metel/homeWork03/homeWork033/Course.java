package main.java.mihail_metel.homeWork03.homeWork033;

import java.util.Date;

/*You need to create following structure of the classes.

        Class Course with fields: Date startDate, String name, int hoursDuration, String teacherName.
        Create two constructors with fields startDate, name; and hourseDuration, name, teacherName.

        Class Student with fields: String firstName, String lastName, int group, Course[] coursesTaken, int age.
        With 2 constructors firstName, lastName, group; and lastName, coursesTaken.

        CollegeStudent that is a child of Student. With additional fields: String collegeName, int rating, long id.
        Create three constructors: two the same as in Student and one with all the fields of the class.

        Class SpecialStudent that is child of CollegeStudent. With additional fields long secretKey, String email.
        Create three constructors: two the same as in CollegeStudend and one with secretKey field.

        Create getters and setters for all fields and make fields private as OOP principle follows.
        Create 5 objects Course class. Create objects of others classes using every constructor.
        You must have 13 objects in Solution class.
*/

public class Course {
    private Date startDate;
    private String name;
    private int coursDuration;
    private String teacherName;

    public Course(Date startDate, String name) {
        this.startDate = startDate;
        this.name = name;
    }

    public Course(String name, int coursDuration, String teacherName) {
        this.name = name;
        this.coursDuration = coursDuration;
        this.teacherName = teacherName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCoursDuration() {
        return coursDuration;
    }

    public void setCoursDuration(int coursDuration) {
        this.coursDuration = coursDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
