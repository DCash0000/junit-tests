import java.util.ArrayList;
import java.util.Iterator;

public class Student {
    private long id;
    private String firstName;
    private String lastName;
    private ArrayList<Integer> grades;


    public Student(long id, String firstName, String lastName, ArrayList<Integer> grades) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = new ArrayList<>();
    }


    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public double getGradeAverage(){
        double total = 0;
        double grade = 0;
        Double tempDouble = null;
        Iterator iterator  = grades.iterator();
        while(iterator.hasNext()){
            tempDouble = (Double) iterator.next();
            grade = tempDouble;
            total = total + grade;
        }
        return total / grades.size();

    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
