package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class Developer {
	
	private String name;
    private String id;
    private Set<Project> projects;
    private Set<Project> projectsLead;
    private Set<Task> tasks;

    /**
     * Default constructor
     */
    public Developer() {
    }

    /**
     * @param name 
     * @return void
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * @param id 
     * @return void
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return String
     */
    public String getId() {
        return id;
    }

    /**
     * @param tasks 
     * @return void
     */
    public void setTasks(Set<Task> tasks) {
        this.tasks = tasks;
    }

    /**
     * @return Set<Task>
     */
    public Set<Task> getTasks() {
        return tasks;
    }

    /**
     * @param projects 
     * @return
     */
    public void setProjects(Set<Project> projects) {
    	this.projects = projects;
    }

    /**
     * @return
     */
    public Set<Project> getProjects() {
        return projects;
    }

    /**
     * @param projects 
     * @return
     */
    public void setProjectsLead(Set<Project> projects) {
        this.projectsLead = projects;
    }

    /**
     * @return
     */
    public Set<Project> getProjectsLead() {
        return projectsLead;
    }

}