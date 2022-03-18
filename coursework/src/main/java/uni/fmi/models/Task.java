package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class Task {
	private String status;
    private String id;
    private String description;
    private Project project;
    private Task task;
    private Set<Task> tasks;
    private Developer developer;

    /**
     * Default constructor
     */
    public Task() {
    }
    

    /**
     * @param status 
     * @return
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return
     */
    public String getStatus() {
        return status;
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

    /**
     * @param developer 
     * @return
     */
    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }

    /**
     * @return
     */
    public Developer getDeveloper() {
        return developer;
    }

    /**
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description 
     * @return
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * @param task 
     * @return
     */
    public void setTask(Task task) {
        this.task = task;
    }

    /**
     * @return
     */
    public Task getTask() {
        return task;
    }
}