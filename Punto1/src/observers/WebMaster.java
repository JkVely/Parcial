package observers;

import java.util.List;

import courses.*;

public class WebMaster implements Observer {
    private String name;
    private String email;
    
    public WebMaster(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Observer method
    @Override
    public void update(List<Course> courses) {
        System.out.println("WebMaster " + name + " has been notified of courses updates:");
        for (Course course: courses) {
            if (course.getCourseState() == CourseState.NEW) {
                System.out.println("New course available: " + course.getCourseName());
            } else if (course.getCourseState() == CourseState.REMOVED) {
                System.out.println("Course removed: " + course.getCourseName());
            } else {
                System.out.println("Course updated: " + course.getCourseName());
            }
            System.out.println("Course description: " + course.getCourseDescription());
            System.out.println("Course duration: " + course.getCourseDuration() + " hours");
            System.out.println("Course state: " + course.getCourseState());
            System.out.println("--------------------------------------------------");
        }
    }


}
