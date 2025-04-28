import courses.*;
import observers.*;


public class App {

    public static void main(String[] args) throws Exception {
        OficinaTIC oficinaTIC = new OficinaTIC();
        WebMaster webMaster1 = new WebMaster("Andrea Mahecha", "andrea@example.com");
        Course course1 = new Course("IA applied on education", 20, "IA applied on education course description");
        oficinaTIC.register(webMaster1);
        System.out.println("WebMaster registered: " + webMaster1.getName() + ", " + webMaster1.getEmail());
        oficinaTIC.addCourse(course1);
        oficinaTIC.removeCourse(course1);
        Periodist periodist1 = new Periodist("Luz Dari Varela", "luzd@example.com");
        oficinaTIC.register(periodist1);
        System.out.println("Periodist registered: " + periodist1.getName() + ", " + periodist1.getEmail());
        Course course2 = new Course("Decolonial pedagogy", 30, "Decolonial pedagogy course description");
        oficinaTIC.addCourse(course2);
        course2.setCourseState(CourseState.ABANDONED);
        
        CommunityManager communityManager1 = new CommunityManager("Laura Molina",Long.parseLong("3001234567"));
        oficinaTIC.register(communityManager1);
        System.out.println("Community Manager registered: " + communityManager1.getName() + ", " + communityManager1.getPhoneNumber());
        oficinaTIC.updateCourse(course2);
    }
}
