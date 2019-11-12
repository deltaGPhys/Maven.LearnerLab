package io.zipcoder.interfaces;

public final class Students extends People {

    private static final Students INSTANCE = new Students();

    private Students() {
        this.add(new Student(2, "Grace"));
        this.add(new Student(4, "Brian"));
        this.add(new Student(6, "Jack"));
        this.add(new Student(3, "Sandy"));
        this.add(new Student(9, "David"));
    }

    public static Students getInstance() {
        return INSTANCE;
    }
}
