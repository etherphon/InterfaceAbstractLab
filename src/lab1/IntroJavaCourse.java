package lab1;

import javax.swing.JOptionPane;

/**
 * Provides constructor for IntroToJavaCourse.
 * 
 * @author      joel hedding
 * @version     1.00
 */
public class IntroJavaCourse extends ProgrammingCourse {

    private String prerequisites;
    
    public IntroJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
        super(courseName, courseNumber, credits);
        this.prerequisites = prerequisites;
    }
    
    public IntroJavaCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
    }

    public IntroJavaCourse() {
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }
}
