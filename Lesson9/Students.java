package Lesson9;

import java.util.List;
import java.util.Objects;

public class Students {
    private String name;
    private List<Course> courses;

    public Students(String name, List<Course> courses) {
        this.name = name;
        this.courses = courses;
    }

    public String getName() {
        return this.name;
    }
    public List<Course> getAllCourses() {
        return this.courses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return Objects.equals(name, students.name) && Objects.equals(courses, students.courses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, courses);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
