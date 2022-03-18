package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class Project {
	private String id;
    private String name;
    private Project project;
    private Set<Project> projects;
    private Set<Task> tasks;
    private Set<Developer> developers;
    private Developer leadDeveloper;
	
    /**
     * Default constructor
     */
    public Project() {
    }

    /**
     * @param id 
     * @return
     */
    public void setId(String id) {
    	this.id = id;
    }

    /**
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * @param name 
     * @return
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */
    public String getName() {
        return name;
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
     * @param tasks 
     * @return
     */
    public void setTasks(Set<Task> tasks) {
        this.tasks = tasks;
    }

    /**
     * @return
     */
    public Set<Task> getTasks() {
        return tasks;
    }

    /**
     * @param developers 
     * @return
     */
    public void setDevelopers(Set<Developer> developers) {
        this.developers = developers;
    }

    /**
     * @return
     */
    public Set<Developer> getDevlopers() {
        return developers;
    }

    /**
     * @param lead 
     * @return
     */
    public void setLeadDeveloper(Developer leadDeveloper) {
        this.leadDeveloper = leadDeveloper;
    }

    /**
     * @return
     */
    public Developer getLeadDeveloper() {
        return leadDeveloper;
    }
    
    /**
     * @param project 
     * @return
     */
    public void setProject(Project project) {
        this.project = project;
    }

    /**
     * @return
     */
    public Project getProject() {
        return project;
    }
}