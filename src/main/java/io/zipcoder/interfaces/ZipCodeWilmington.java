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

        Learner[] learners = Arrays.copyOf(students.toArray(), students.toArray().length, Learner[].class);
        teacher.lecture(learners, numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {
        Teacher teacher = (Teacher) instructors.findById(id);
        hostLecture(teacher, numberOfHours);
    }

    public HashMap<Student,Double> getStudyMap() {
        HashMap<Student, Double> map = new HashMap<>();
        for (Person student : students.toArray()) {
            map.put((Student) student,((Student) student).getTotalStudyTime());
        }
        return map;
    }
}
