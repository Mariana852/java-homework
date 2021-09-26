import java.util.ArrayList;
import java.util.Iterator;

public class calculateStudentsAvg {
    public static void main(String[] args){
        Student s1 = new Student("Mariana Testemitanu",9);
        Student s2 = new Student("Oana Zavoreanu",7);
        Student s3 = new Student("Ana Scutaru",9);
        Student s4 = new Student("Iuliana Bodorin",8);
        Student s5 = new Student("Mariana Albot",5);

        ArrayList<Student> arrayOfStudents = new ArrayList<Student>();

        arrayOfStudents.add(s1);
        arrayOfStudents.add(s2);
        arrayOfStudents.add(s3);
        arrayOfStudents.add(s4);
        arrayOfStudents.add(s5);

        Iterator<Student> itr = arrayOfStudents.iterator();
        int gradesSum = 0;

        while (itr.hasNext()) {
            Student st = itr.next();
            gradesSum = gradesSum + st.grade;
        }

        System.out.println("The average grade it is: " + (gradesSum / arrayOfStudents.size()));
    }
}

class Student {
    String name;
    int grade;

    Student(String name, int grade){
        this.name = name;
        this.grade = grade;
    }
}