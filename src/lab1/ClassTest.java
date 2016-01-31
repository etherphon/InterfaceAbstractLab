/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author etherdesign
 * This is a test of the abstract class design, in this design most of the shared
 * methods are defined and implemented in the superclass, it is handy that it is
 * all in one place, but you don't know what methods your subclasses are inheriting
 * unless you look at the superclass.
 * 
 * 
 */
public class ClassTest {
    
    public static void main(String[] args) {
        
        // polymorphism + object array, enhanced loop
        ProgrammingCourse[] courses = {
          new AdvancedJavaCourse(), new IntroJavaCourse(), new IntroToProgrammingCourse()
        };
        
        for (ProgrammingCourse pc : courses) {
            pc.getCourseName();
        }
        
        ProgrammingCourse introJava = new IntroJavaCourse("Intro to Java", "123456");
        introJava.setCredits(3.0);
        System.out.println(introJava.getCourseNumber());
        
        ProgrammingCourse introPgm = new IntroToProgrammingCourse();
        introPgm.setCourseName("Intro to Programming");
        System.out.println(introPgm.getCourseName());
        
        ProgrammingCourse advJava = new AdvancedJavaCourse();
        advJava.setCourseName("Advanced Java");
        advJava.setCourseNumber("123457");
        advJava.setCredits(4.0);
        // using this method of intantiating a class does not allow the class
        // to run any methods that are not defined in the superclass
        // advJava.setPrerequisites(); not allowed
        // i don't see when this could ever be advantageous unless
        // all the subclasses have the same methods
        System.out.println(advJava.getCredits());
        
        // this allows subclass specific methods to be used
        AdvancedJavaCourse advJava2 = new AdvancedJavaCourse();
        advJava2.setPrerequisites("Intro to Java");
        System.out.println(advJava2.getPrerequisites());
        advJava2.setCourseName("Advanced Java");
        System.out.println(advJava2.getCapitalizedCourseName());
        
        
    }
    
}
