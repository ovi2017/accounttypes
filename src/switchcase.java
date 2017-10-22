import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

//Ovidio Castillo
//Purpose: To Display welcome messages for each choice of user
//Date: 10/21/2017
//License: GNU


public class switchcase extends Application {
            //Creates the Options box
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Choose Account Type");
        primaryStage.setWidth(300);
                    //creates drop down Menu for choices
        ObservableList<String> options = FXCollections.observableArrayList("Administrator", "Faculty", "Student", "Staff", "Guest");
        ComboBox combobox = new ComboBox(options);
        Label label = new Label("Greeting");
        FlowPane pane = new FlowPane();
                    //Displays the choice and welcome
        combobox.setOnAction(e->System.out.println("Welcome " + combobox.getValue()));
        Scene scene = new Scene(combobox);
        primaryStage.setScene(scene);
        primaryStage.show();

    }}


