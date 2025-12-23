package classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Task {
    private static int idCounter = 1;
    private int id;
    private String description;
    private LocalDate deadlineDate;
    private boolean isCompleted;
    private String priority;

    public Task(String description, String deadline, String priority) {
        this.id = idCounter++;
        this.description = description;
        setDeadline(deadline); // ✅ fixed
        this.priority = priority;
        this.isCompleted = false;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDeadline() {
        return deadlineDate;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public String getPriority() {
        return priority;
    }

    public void markAsCompleted() {
        this.isCompleted = true;
        System.out.println("Task ID: " + id + " marked as completed."); // Log completion functionality
    }

    // Method to set the deadline with validation
    public void setDeadline(String deadlineDate) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            this.deadlineDate = LocalDate.parse(deadlineDate, formatter); // ✅ fixed
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format! Please use 'yyyy-MM-dd'.");
            this.deadlineDate = null; // ✅ fixed
        }
    }

    @Override
    public String toString() {
        return "Task ID: " + id +
               ", Description: " + description +
               ", Deadline: " + deadlineDate +
               ", Completed: " + (isCompleted ? "Yes" : "No") +
               ", Priority: " + priority;
    }
}
