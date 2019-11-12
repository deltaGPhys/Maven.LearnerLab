package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class TestZipCodeWilmington {

    @Test
    public void testHostLecture() {
        ZipCodeWilmington zcw = new ZipCodeWilmington();

        zcw.hostLecture(1, 20);

        HashMap<Student, Double> map = zcw.getStudyMap();

        for (Student student : map.keySet()) {
            Assert.assertEquals(4, student.getTotalStudyTime(), .01);
        }
    }
}
