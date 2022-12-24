import java.time.LocalDateTime;

public class DailyTask extends Task implements Repeatable{
    public DailyTask(String title, TaskType taskType, String taskDescription, LocalDateTime dateTime) {
        super(title, taskType, taskDescription, dateTime);
    }

    @Override
    public boolean checkDate(LocalDateTime requestedDate) {
        return getDateTime().toLocalDate().equals(requestedDate.toLocalDate());
    }
}
