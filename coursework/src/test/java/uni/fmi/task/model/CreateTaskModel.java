package uni.fmi.task.model;

import uni.fmi.task.service.CreateTaskService;

public class CreateTaskModel {

	private String taskName;
	private String message;
	
	public void setTaskName(final String taskName) {
		this.taskName = taskName;
	}

	public void clickCreateTaskButton() {
		message = CreateTaskService.createTask(this.taskName);
	}

	public String getMessage() {
		return message;
	}

}
