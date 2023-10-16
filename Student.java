import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int studentId;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public static int getStudentId() {
        return 0;
    }

    // Getters and toString method...
}