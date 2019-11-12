package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void test() {

        Assert.assertEquals("Grace", Students.getInstance().findById(2).getName());
        Assert.assertEquals("Brian", Students.getInstance().findById(4).getName());
        Assert.assertEquals("Jack", Students.getInstance().findById(6).getName());
        Assert.assertEquals("Sandy", Students.getInstance().findById(3).getName());
        Assert.assertEquals("David", Students.getInstance().findById(9).getName());
    }
}
