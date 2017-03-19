package main.java.mihail_metel.homeWork03.homeWork033;

/*You need to create following structure of the classes.

        Class Course with fields: Date startDate, String name, int hoursDuration, String teacherName.
        Create two constructors with fields startDate, name; and hourseDuration, name, teacherName.

        Class Student with fields: String firstName, String lastName, int group, Course[] coursesTaken, int age.
        With 2 constructors firstName, lastName, group; and lastName, coursesTaken.

        CollegeStudent that is a child of Student. With additional fields:
        String collegeName, int rating, long id.
        Create three constructors: two the same as in Student and one with all the fields of the class.

        Class SpecialStudent that is child of CollegeStudent. With additional fields
        long secretKey, String email.
        Create three constructors: two the same as in CollegeStudend and one with secretKey field.

        Create getters and setters for all fields and make fields private as OOP principle follows.
        Create 5 objects Course class. Create objects of others classes using every constructor.
        You must have 13 objects in Solution class.
*/

public class SpecialStudent extends CollegeStudent {
    private long secretKey;
    private String email;

    public SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public SpecialStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public SpecialStudent(String firstName, String lastName, int group, long secretKey) {
        super(firstName, lastName, group);
        this.secretKey = secretKey;
    }

    public long getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
