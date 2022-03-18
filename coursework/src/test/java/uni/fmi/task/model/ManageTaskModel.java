package uni.fmi.task.model;

import uni.fmi.models.Developer;
import uni.fmi.models.Task;

public class ManageTaskModel {
	private Developer developer;
	private Task task;
	private String message;
	private String newStatus;
	public ManageTaskModel() {
		developer = new Developer();
		developer.setName("Developer 42");
		task = new Task();
		task.setStatus("New");
		task.setDeveloper(developer);
	}
	public Boolean isEmployeeAssigned() {
		if(task.getDeveloper() != null) {
			return true;
		}
		return false;
	}
	public void clickStartTaskModel() {
		if(this.isEmployeeAssigned()) {
			task.setStatus("In Development");
			this.message = "Task started!";
		}
		else {
			this.message = "Developer not assigned!";
		}
		
	}
	public Object getMessage() {
		return message;
	}
	public void taskEmployee(Developer developer) {
		task.setDeveloper(developer);
	}
	public void finishTask() {
		task.setStatus("Finished");
	}
	public String getStatus() {
		return task.getStatus();
	}
	public void setNewStatus(String newStatus) {
		this.newStatus = newStatus;
	}
	public void clickUpdateStatusButton() {
		if(task.getStatus() == "Finished") {
			this.message = "Cannot update finished task.";
		}
		else {
			task.setStatus(newStatus);
			this.message = "Status updated";
		} 
		
	}
	
}
