package com.example.test;

import com.example.model.Student;
import com.example.view.StudentView;
import com.example.controller.StudentController;

public class MVCPatternTest {
    public static void main(String[] args) {
        // Create a student
        Student student = new Student("ARYA", "123", "A");

        // Create a view to display student details
        StudentView view = new StudentView();

        // Create a controller to handle the communication between model and view
        StudentController controller = new StudentController(student, view);

        // Display the initial details
        controller.updateView();

        // Update student details
        controller.setStudentName("ARYA KUMAR BHANJA");
        controller.setStudentGrade("A");

        // Display the updated details
        controller.updateView();
    }
}
