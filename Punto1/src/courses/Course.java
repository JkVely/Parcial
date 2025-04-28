package courses;

import observers.Observer;
import java.util.ArrayList;
import java.util.List;


public class Course {
    private String courseName;
    private CourseState courseState;
    private int courseDuration;
    private String courseDescription;

    public Course(String courseName, int courseDuration, String courseDescription) {
        this.courseName = courseName;
        this.courseDuration = courseDuration;
        this.courseDescription = courseDescription;
        this.courseState = CourseState.NEW;
    }


    // Getters
    public String getCourseName() {
        return courseName;
    }

    public CourseState getCourseState() {
        return courseState;
    }

    public int getCourseDuration() {
        return courseDuration;
    }

    public String getCourseDescription() {
        return courseDescription;
    }


    // Setters
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseState(CourseState courseState) {
        this.courseState = courseState;
    }

    public void setCourseDuration(int courseDuration) {
        this.courseDuration = courseDuration;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }
}
