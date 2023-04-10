package grade_calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import java.util.*;

public class GradeCalculatorController {
    private List<Grade> grades = new ArrayList<>();
    @FXML
    private Button addButton;

    @FXML
    private Button removeButton;

    @FXML
    private Button calculateButton;

    @FXML
    private ListView<Grade> gradeList;

    @FXML
    private TextField finalGradeDesired;

    @FXML
    private TextField weight;

    @FXML
    private TextField grade;

    @FXML
    private Label errorMsg;

    @FXML
    void addGrade(ActionEvent event) {
        //Validation
        //Check if inputs are not empty

        //Check if value is double value

        //Create new Grade object and display to ListView

        //update weighted
    }

    @FXML
    void removeGrade(ActionEvent event) {

    }

    @FXML
    void calculateGrade(ActionEvent event) {

    }

    @FXML
    void finalCalculate(ActionEvent event) {

    }

    void displayGrades(List<Grade> grades, ListView<Grade> gradeView) {

    }
}
