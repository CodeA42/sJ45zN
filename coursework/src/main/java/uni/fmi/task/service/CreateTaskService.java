package uni.fmi.task.service;

import uni.fmi.models.Task;

public class CreateTaskService {

	public static String createTask(final String description) {
		if(description != null) {
			Task task = new Task();
			task.setDescription(description);
			return "Task created!";	
		}
		return "No Task name!";
	}
	
}
