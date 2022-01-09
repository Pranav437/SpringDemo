package co.pragra.learning.springdemo.model;

import java.time.Instant;
import java.util.List;
import java.util.Map;

public class Peron {
    private String name;
    private List<String> hobbies;
    private Map<String,String> courseMap;
    private Instant createDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Map<String, String> getCourseMap() {
        return courseMap;
    }

    public void setCourseMap(Map<String, String> courseMap) {
        this.courseMap = courseMap;
    }

    public Instant getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Instant createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Person " +
                "Name='" + name + '\'' +
                " Hobbies=" + hobbies +
                " CourseMap=" + courseMap +
                " CreateDate=" + createDate ;
    }
public void doInit(){
    System.out.println("Initializing......");
}
public void preDestroy(){
    System.out.println("Destroyed");
}
}
