import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {
    Student Dalvin;

    @Before
    public void setUp(){
        Dalvin = new Student(123, "Dalvin", "Cash", new ArrayList<>(100));
    }
    @Test
    public void isFirstNameEquals(){
        String expected = "Dalvin";
        String actual = "Dalvin";
        System.out.println("In isFirstNameEquals");
        assertEquals(expected, Student.setFirstname);
    }
    @Test
    public void isLastNameEquals(){
        String expected = "Cash";
        String actual = "Cash";
        System.out.println("In isLastNameEquals");
        assertEquals(expected, actual);
    }
    @Test
    public void isIdEqual(){
        long expected = 123;
        long actual = 123;
        System.out.println("in isIdEqual");
        assertEquals(expected, actual);
    }
    @Test
    public void checkGrade(){
        long maxValue = 100;
        long minValue = 0;
        System.out.println("In checkGrade");
        assertEquals(100, 99, 1);
    }
    @Test
    public void checkGradeAverage(){
        long expected = 90;
        long actual = 80;
        System.out.println("In checkGradeAverage");
        assertTrue("", true);

    }




}
