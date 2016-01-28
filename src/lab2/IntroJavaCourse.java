package lab2;

/**
 * Describe responsibilities here.
 *
 * @author      joel hedding
 * @version     1.00
 */
public class IntroJavaCourse implements ProgrammingCourse {
    String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    public String getCourseName() {
        return courseName;
    }
  
    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }
    
    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }
    
    public double getCredits() {
        return credits;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }
    
    public String getPrerequisites() {
        return prerequisites;
    }

}
