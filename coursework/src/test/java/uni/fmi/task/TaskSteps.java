package uni.fmi.task;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import uni.fmi.task.model.CreateTaskModel;
import uni.fmi.task.model.ManageTaskModel;

public class TaskSteps {
	
	private CreateTaskModel createTaskModel;
	private ManageTaskModel manageTaskModel;
	
	@Given("Open CreateTask screen")
	public void openCreateTaskScreen() {
	    createTaskModel = new CreateTaskModel();
	}
	@When("Task description is input")
	public void inputTaskName() {
	    createTaskModel.setTaskName("TestTask");
	}
	@When("Create Task button is pressed")
	public void clickCreateTaskButton() {
	    createTaskModel.clickCreateTaskButton();
	}
	@Then("Success Message received")
	public void checkMessage() {
	    assertEquals("Task created!", createTaskModel.getMessage());
	}
	@Then("Failure Message received")
	public void checkFailureMessage() {
		 assertEquals("No Task name!", createTaskModel.getMessage());
	}
	@Given("Manage Task window is opened")
	public void openManageTaskScreen() {
	    manageTaskModel = new ManageTaskModel();
	}
	@Given("Employee is asigned to task")
	public void checkEmployeeAssigned() {
		assertEquals(true, manageTaskModel.isEmployeeAssigned());
	}
	@When("Start task button is pressed")
	public void start_task_button_is_pressed() {
	    manageTaskModel.clickStartTaskModel();
	}
	@Then("Receives success message")
	public void receives_success_message() {
		assertEquals("Task started!", manageTaskModel.getMessage());
	}
	@Given("Employee is not asigned to task")
	public void employee_is_not_asigned_to_task() {
		manageTaskModel.taskEmployee(null);
		assertEquals(false, manageTaskModel.isEmployeeAssigned());
	}
	@Then("Receives failure message")
	public void receives_failure_message() {
		assertEquals("Developer not assigned!", manageTaskModel.getMessage());
	}
	@Given("Task is finished")
	public void task_is_finished() {
		manageTaskModel.finishTask();
		assertEquals("Finished", manageTaskModel.getStatus());
	}
	@When("Status is changed")
	public void status_is_changed() {
	    manageTaskModel.setNewStatus("In Development");
	}
	@When("Update status button is pressed")
	public void update_status_button_is_pressed() {
	    manageTaskModel.clickUpdateStatusButton();
	}
	@Then("Receives failure to change status message")
	public void receives_failure_to_change_status_message() {
		assertEquals("Cannot update finished task.", manageTaskModel.getMessage());
	}
}
