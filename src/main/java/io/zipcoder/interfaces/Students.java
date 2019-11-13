package io.zipcoder.interfaces;

public final class Students extends People<Student> {

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

    public Student[] toArray() {
        Student[] result = new Student[INSTANCE.count()];
        int i = 0;
        for (Student student: INSTANCE) {
            result[i++] = student;
        }
        return result;
    }
}
