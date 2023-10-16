/*  Title: MajorProjectPart1
// Author: Bethelhem Garay
// Course Section: CMIS202-ONL1 (Seidel) Fall 2023
// File: AttendanceTrackerProject.java
// Description: This project is a simple functional Java prototype for a system that
 tracks student attendance and uses JavaFX for the graphical user interface.
 
 */


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AttendanceTrackerProject extends Application {
    private AttendanceTracker attendanceTracker = new AttendanceTracker();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Student Attendance Tracker");

        VBox layout = new VBox(10);
        layout.setMinWidth(250);

        Button addStudentButton = new Button("Add Student");
        addStudentButton.setOnAction(e -> {
            // Logic for adding a student...
        });

        Button recordAttendanceButton = new Button("Record Attendance");
        recordAttendanceButton.setOnAction(e -> {
            // Logic for recording attendance...
        });

        Button sortButton = new Button("Sort Students");
        sortButton.setOnAction(e -> {
            attendanceTracker.sortStudentsById();
            attendanceTracker.printStudents();
        });

        Button saveButton = new Button("Save to File");
        saveButton.setOnAction(e -> {
            attendanceTracker.saveToFile("attendance_data.dat");
            attendanceTracker.printAttendanceRecords();
        });

        Button loadButton = new Button("Load from File");
        loadButton.setOnAction(e -> {
            attendanceTracker.loadFromFile("attendance_data.dat");
            attendanceTracker.printStudents();
            attendanceTracker.printAttendanceRecords();
        });

        layout.getChildren().addAll(addStudentButton, recordAttendanceButton, sortButton, saveButton, loadButton);

        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}