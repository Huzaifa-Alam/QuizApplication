module com.example.quizapplication {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires jdk.xml.dom;
    requires java.desktop;

    opens com.example.quizapplication to javafx.fxml;
    exports com.example.quizapplication;
}