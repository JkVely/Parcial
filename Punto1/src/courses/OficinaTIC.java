package courses;

import java.util.List;
import java.util.ArrayList;

import observers.Observer;

public class OficinaTIC implements Subject {
    private List<Observer> observers;
    private List<Course> courses;
    
    public OficinaTIC() {
        this.observers = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void delete(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(courses);
        }
    }

    public void addCourse(Course course) {
        courses.add(course);
        notifyObservers();
    }

    public void removeCourse(Course course) {
        getCourseByName(course.getCourseName()).setCourseState(CourseState.REMOVED);
        notifyObservers();
    }

    public void updateCourse(Course course) {
        Course existingCourse = getCourseByName(course.getCourseName());
        if (existingCourse != null) {
            existingCourse.setCourseState(course.getCourseState());
            existingCourse.setCourseDuration(course.getCourseDuration());
            existingCourse.setCourseDescription(course.getCourseDescription());
            notifyObservers();
        }
    }

    public Course getCourseByIndex(int index) {
        return courses.get(index);
    }

    public Course getCourseByName(String name) {
        for (Course course : courses) {
            if (course.getCourseName().equals(name)) {
                return course;
            }
        }
        return null;
    }
}
