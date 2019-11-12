package io.zipcoder.interfaces;

public final class Instructors extends People {

    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        this.add(new Instructor(1, "Kris"));
        this.add(new Instructor(9, "Chris"));
        this.add(new Instructor(10, "Froilan"));
        this.add(new Instructor(11, "Dolio"));
        this.add(new Instructor(6, "Roberto"));
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }
}