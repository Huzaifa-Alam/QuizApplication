package com.example.quizapplication;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuizController {
    @FXML
    public Text question;

    @FXML
    public Button opt1, opt2, opt3, opt4;

    static int counter = 0;
    static int correct = 0;
    static int wrong = 0;

    private List<Question> questions;//List<Question>: This specifies the type of the variable.
    // meaning that this list will hold objects of type Question.

    @FXML
    private void initialize() {
        QuestionBank qb = new QuestionBank();
        questions = qb.getQuestions();
        Collections.shuffle(questions); // Collections is used to shuffle the elements in the questions // Shuffle the questions
        counter = 0;
        correct = 0;
        wrong = 0;
        displayQuestion();
    }

    private void displayQuestion() {
        if (counter < 10) { // Assuming a quiz of 10 questions
            Question q = questions.get(counter);
            question.setText(q.getQuestionText());  // question is id of label
            opt1.setText(q.getOption1());
            opt2.setText(q.getOption2());
            opt3.setText(q.getOption3());
            opt4.setText(q.getOption4());
        }
    }

    @FXML
    public void opt1clicked(ActionEvent actionEvent) {
        processAnswer(opt1.getText(), actionEvent); //The processAnswer method handles the logic for checking if the selected answer is correct and updating the quiz state accordingly.
    }

    @FXML
    public void opt2clicked(ActionEvent actionEvent) {
        processAnswer(opt2.getText(), actionEvent);
    }

    @FXML
    public void opt3clicked(ActionEvent actionEvent) {
        processAnswer(opt3.getText(), actionEvent);
    }

    @FXML
    public void opt4clicked(ActionEvent actionEvent) {
        processAnswer(opt4.getText(), actionEvent);
    }

    private void processAnswer(String answer, ActionEvent actionEvent) {
        if (checkAnswer(answer)) {
            correct++;
        } else {
            wrong++;
        }

        if (counter == 9) {
            loadResultScreen(actionEvent);
        } else {
            counter++;
            displayQuestion();
        }
    }

    private void loadResultScreen(ActionEvent actionEvent) {
        try {
            Stage thisstage = (Stage) ((Button) actionEvent.getSource()).getScene().getWindow();
            thisstage.close();

            FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("result.fxml"));
            Scene scene = new Scene(fxmlloader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean checkAnswer(String answer) {
        return questions.get(counter).getCorrectAnswer().equals(answer);
    }
}

class Question {
    private String questionText;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String correctAnswer;

    public Question(String questionText, String option1, String option2, String option3, String option4, String correctAnswer) {
        this.questionText = questionText;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getOption1() {
        return option1;
    }
    
    public String getOption2() {
        return option2;
    }

    public String getOption3() {
        return option3;
    }

    public String getOption4() {
        return option4;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
}
