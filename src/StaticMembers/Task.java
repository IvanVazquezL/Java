package StaticMembers;

import java.util.Date;

public class Task {
    private String description;
    private Date createdDate; // Timestamp for when the task was created

    // Static field to track the time when the last task was created
    public static Date lastCreated;

    public Task(String description) {
        this.description = description;
        this.createdDate = new Date();
        // Update the lastCreated field with the current time whenever a new task is created
        lastCreated = this.createdDate;
    }

    // Getters and setters for description and createdDate
    public String getDescription() {
        return description;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    // Static method to print the timestamp of the last created task
    public static void printLastCreated() {
        if (lastCreated != null) {
            System.out.println("Timestamp of the last created task: " + lastCreated);
        } else {
            System.out.println("No tasks have been created yet.");
        }
    }
}

