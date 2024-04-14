package com.example.demo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class NewApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox(20);
        root.setAlignment(Pos.TOP_CENTER);
        root.setPadding(new Insets(20));

        TextField text1 = new TextField();
        TextField text2 = new TextField();
        TextField text3 = new TextField();
        Label label = new Label();

        Button action = new Button("copy");
        Button action2 = new Button("copy");
        Button action3 = new Button("copy to the first text field");


        action.setOnAction(actionEvent -> text2.setText(text1.getText()));
        action2.setOnAction(actionEvent -> text3.setText(text2.getText()));
        action3.setOnAction(actionEvent -> text1.setText(text3.getText()));

        text2.setOnAction(text2Event -> label.setText(text2.getText()));

        root.getChildren().addAll(text1, action, text2, label, action2, text3, action3);


        Scene scene = new Scene(root, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello world!");
        primaryStage.show();
    }
}
