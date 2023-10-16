import java.io.Serializable;
import java.util.Date;

public class Attendance implements Serializable {
    private int studentId;
    private Date date;
    private boolean isPresent;

    public Attendance(int studentId, Date date, boolean isPresent) {
        this.studentId = studentId;
        this.date = date;
        this.isPresent = isPresent;
    }

    // Getters and toString method...
}
 