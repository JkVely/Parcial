package observers;
import java.util.List;

import courses.Course;

public interface Observer {
    public void update(List<Course> courses);
}
