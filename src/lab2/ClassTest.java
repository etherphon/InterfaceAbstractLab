/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author etherdesign
 */
public class ClassTest {
 
    public static void main(String[] args) {
     
        ProgrammingCourse introJava2 = new IntroJavaCourse("Intro to Java", "123456");
        introJava2.setCredits(3.0);
        System.out.println(introJava2.getCourseName());
        
        ProgrammingCourse introPgm2 = new IntroToProgrammingCourse("Intro to Programming", "234567");
        introPgm2.setCourseName("Intro to Programming");
        System.out.println(introPgm2.getCourseNumber());
        
        ProgrammingCourse advJava3 = new AdvancedJavaCourse("Advanced Java", "345678");
        advJava3.setCourseName("Advanced Java");
        advJava3.setCourseNumber("123457");
        advJava3.setCredits(4.0);
        // using this method of intantiating a class does not allow the class
        // to run any methods that are not defined in the superclass
        // advJava3.setPrerequisites("Intro to Java"); not allowed
        // i don't see when this could ever be advantageous unless
        // all the subclasses have the same methods
        System.out.println(advJava3.getCourseName());
        
        // this allows subclass specific methods to be used
        AdvancedJavaCourse advJava4 = new AdvancedJavaCourse("Advanced Java", "345678");
        advJava4.setPrerequisites("Intro to Java");
        System.out.println(advJava4.getPrerequisites());
        advJava4.setCourseName("Advanced Java");
        System.out.println(advJava4.getCapitalizedCourseName());
        
        
    }
    
    
}
