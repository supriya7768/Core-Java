package comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Student implements Comparable<Student> {

    String name;
    int maths;
    int english;
    int science;

    public Student(String name, int maths, int english, int science) {
        this.name = name;
        this.maths = maths;
        this.english = english;
        this.science = science;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", maths=" + maths +
                ", english=" + english +
                ", science=" + science +
                '}';
    }

    public int marks(){
        return maths + english + science;
    }

    @Override
    public int compareTo(Student o) {
//       return Integer.compare(this.marks(), o.marks());
        if (this.marks() > o.marks()){
            return -1;
        } else if (this.marks() < o.marks()) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        List<Student> student = new ArrayList<>();
        student.add(new Student("Supriya", 95,98, 92));
        student.add(new Student("Ganesh", 98, 78, 90));
        student.add(new Student("Jayesh", 94, 89, 82));
        student.add(new Student("Naushad", 98, 81, 79));
        student.add(new Student("Vijaya", 93, 90, 94));
        student.add(new Student("Atarva", 92, 90, 87));

        Collections.sort(student);

        System.out.println(student);
    }
}
