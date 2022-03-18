Feature: Task
  
  Scenario: Create Task
  	Given Open CreateTask screen
  	When Task description is input
  	And Create Task button is pressed
  	Then Success Message received
  	
	Scenario: Create Task without giving task name
		Given Open CreateTask screen
  	When Create Task button is pressed
  	Then Failure Message received
  
  Scenario: Start work on task with assigned employee
  	Given Manage Task window is opened
    And Employee is asigned to task
    When Start task button is pressed
    Then Receives success message

  Scenario: Start work on task without assigned employee
  	Given Manage Task window is opened
    And Employee is not asigned to task
    When Start task button is pressed
    Then Receives failure message
    
  Scenario: Attempt to change status of finished task
  	Given Manage Task window is opened
  	And Task is finished
  	When Status is changed
  	When Update status button is pressed
  	Then Receives failure to change status message
  	