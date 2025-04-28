package observers;

import java.util.List;

import courses.*;

public class CommunityManager implements Observer {
    private String name;
    private long phoneNumber;

    public CommunityManager(String name, long phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    @Override
    public void update(List<Course> courses) {
        System.out.println("Community Manager " + name + " has been notified of courses updates:");
        for (Course course : courses) {
            if (course.getCourseState() == CourseState.NEW) {
                System.out.println("New course available: " + course.getCourseName());
            } else if (course.getCourseState() == CourseState.REMOVED) {
                System.out.println("Course removed: " + course.getCourseName());
            } else {
                System.out.println("Course updated: " + course.getCourseName());
            }
            System.out.println("Course description: " + course.getCourseDescription());
            System.out.println("--------------------------------------------------");
        }
    }

    // Getters
    public String getName() {
        return name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
