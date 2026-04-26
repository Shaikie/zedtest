public class test {

    //variables for each personal information
    public static void main(String[] args) {
        String firstName = "shadrack";
        String lastName = "mollel";
        String studentId = "2024-04-07156";
        String yearOfStudy = "2nd year";
        String programmingBackground =
            "I have a background in programming using c, c++, java, dart";
        String courseGoal =
            "My course goal is to create my own application using both java and dart";
        String funFact = "My favorite programming language is flutter";

        //the output of the Profile Card
        System.out.println(
            "=============================================================="
        );
        System.out.println(
            "                  CS 234 - JAVA PROFILE CARD                  "
        );
        System.out.println(
            "=============================================================="
        );
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Student ID: " + studentId);
        System.out.println("Year of Study: " + yearOfStudy);
        System.out.println(
            "---------------------------------------------------------------"
        );

        System.out.println("Programming Background: " + programmingBackground);
        System.out.println(
            "---------------------------------------------------------------"
        );

        System.out.println("Course Goal: " + courseGoal);
        System.out.println(
            "---------------------------------------------------------------"
        );
        System.out.println("Fun Fact: " + funFact);
        System.out.println(
            "=============================================================="
        );
    }
}
