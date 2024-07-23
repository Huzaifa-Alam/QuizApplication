package com.example.quizapplication;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.StageStyle;

import java.io.IOException;

public class ResultController {
    @FXML
    private Label Marks;

    @FXML
    private Label MarksText;

    @FXML
    private ProgressIndicator correct_progress;

    @FXML
    private Label correcttext;

    @FXML
    private Label remark;

    @FXML
    private ProgressIndicator wrong_progress;

    @FXML
    private Label wrongtext;

    @FXML
    private Button retrybtn;

    @FXML
    private void retryBtnClicked() {
        try {
            // Close the current stage
            Stage stage = (Stage) retrybtn.getScene().getWindow();
            stage.close();

            // Reset the quiz variables
            QuizController.correct = 0;
            QuizController.wrong = 0;
            QuizController.counter = 0;

            // Load the initial quiz scene
            FXMLLoader loader = new FXMLLoader(getClass().getResource("quiz.fxml"));
            Scene scene = new Scene(loader.load());
            Stage newStage = new Stage();
            newStage.setScene(scene);
            newStage.initStyle(StageStyle.TRANSPARENT);
            scene.setFill(Color.TRANSPARENT);
            newStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }






    @FXML
    private void initialize() {
//        correcttext is id of Correct Answer label
        correcttext.setText("Correct Answer: " + String.valueOf(QuizController.correct));
//        wrongtext is id of Incorrect Answer label
        wrongtext.setText("Incorrect Answer: " + String.valueOf(QuizController.wrong));
//          Marks is label of 8/10
        Marks.setText(QuizController.correct + "/10");
        float correctf = (float) QuizController.correct / 10;
        correct_progress.setProgress(correctf);
        float wrongf = (float) QuizController.wrong / 10;
        wrong_progress.setProgress(wrongf);

        int correct = QuizController.correct;

        if (correct < 2) {
            remark.setText("Oh no..! You have failed the quiz. It seems that you need to improve your \nJava knowledge.");
        } else if (correct >= 2 && correct < 5) {
            remark.setText("Oops..! You have scored low marks. It seems you need to enhance your \nJava knowledge.");
        } else if (correct >= 5 && correct <= 7) {
            remark.setText("Good. A bit more improvement might help you to get better results. \nPractice is the key.");
        } else if (correct == 8 || correct == 9) {
            remark.setText("Congratulations! It's your hard work and determination which helped you to score \ngood marks.");
        } else if (correct == 10) {
            remark.setText("Congratulations! You have passed the quiz with full marks because of your hard work \nand dedication.");
        }
    }
}
