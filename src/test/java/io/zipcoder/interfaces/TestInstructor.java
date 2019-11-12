package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation() {
        Instructor instructor = new Instructor(32,"Bash");
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Instructor instructor = new Instructor(32, "Bash");
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {
        Instructor instructor = new Instructor(32, "Bash");
        Student student = new Student(23,"Miff");
        instructor.teach(student, 12);
        Assert.assertEquals(12, student.getTotalStudyTime(), .01);
    }

    @Test
    public void testLecture() {
        Instructor instructor = new Instructor(32, "Bash");
        Student student1 = new Student(23,"Miff");
        Student student2 = new Student(24,"Biff");
        instructor.lecture(new Student[]{student1,student2}, 12);
        Assert.assertEquals(6, student1.getTotalStudyTime(), .01);
        Assert.assertEquals(6, student2.getTotalStudyTime(), .01);
    }
}
