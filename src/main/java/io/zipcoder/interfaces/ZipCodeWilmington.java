package io.zipcoder.interfaces;

import java.util.Arrays;
import java.util.HashMap;

public class ZipCodeWilmington {

    private Students students;
    private Instructors instructors;

    public ZipCodeWilmington() {
        this.students = Students.getInstance();
        this.instructors = Instructors.getInstance();
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {

        teacher.lecture(students.toArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {
        Teacher teacher = instructors.findById(id);
        hostLecture(teacher, numberOfHours);
    }

    public HashMap<Student,Double> getStudyMap() {
        HashMap<Student, Double> map = new HashMap<>();
        for (Student student : students.toArray()) {
            map.put(student, student.getTotalStudyTime());
        }
        return map;
    }
}
