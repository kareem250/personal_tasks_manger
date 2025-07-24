import java.util.Date;
enum Priority{
High,
Medium
,Low
}
enum Status {
Not_Started,
In_progress,
Completed,
Canceled
}
public class Task {
    private String name;
    private Date dueDate;
    private Priority priority;
    private Status status;

    public Task(String name, Date dueDate, Priority priority, Status status) {
        this.name = name;
        this.dueDate = dueDate;
        this.priority = priority;
        this.status = status;
    }

    // جتّرز (getters) للحقول
    public String getName() { return name; }
    public Date getDueDate() { return dueDate; }
    public Priority getPriority() { return priority; }
    public Status getStatus() { return status; }
}
