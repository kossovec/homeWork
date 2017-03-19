package main.java.mihail_metel.homeWork03.homeWork033;

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


import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        Date someDate1 = new Date(2017,1,1);
        Date someDate2 = new Date(2017,6,1);

        System.out.println(someDate1);

        Course courseMath = new Course(someDate1, "Math");
        Course courseJava = new Course("Java", 6, "Games Gosling");
        Course courseTesting = new Course("Testing", 3, "SomeName");
        Course courseEnglish = new Course(someDate2, "English");
        Course courseHybernate = new Course("Hybernate", 6,"Somename2");

        Student studentMisha = new Student("Misha", "Metel", 10);
        Student studentPetia = new Student("Pupkin", new Course[]{courseJava, courseTesting});

        CollegeStudent john = new CollegeStudent("John", "Smith",5);
        CollegeStudent ania = new CollegeStudent("Ivanova", new Course[]{courseMath, courseEnglish});
        CollegeStudent petia = new CollegeStudent("Petia", "Petkin",
                5, "KPI", 15, 100 );

        SpecialStudent katia = new SpecialStudent("Katia", "Pupkina", 2);
        SpecialStudent serega = new SpecialStudent("Zverev", new Course[]{courseJava, courseMath});
        SpecialStudent kolian = new SpecialStudent("Kolian", "Kolianov",3,321654);
    }




}
