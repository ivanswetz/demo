package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class AukApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Pane root = new Pane();
        root.setPrefSize(1000, 800);
        root.setPadding(new Insets(10, 10, 10, 10));
        root.setBackground(new Background(new BackgroundFill(Color.WHITE, null,null)));

        //Title of the application

        Label Title = new Label("My Personal Information");
        Title.setFont(Font.font ("Times New Roman", 40));
        Label warning = new Label("* At this moment we do not accept international students");
        warning.setFont(Font.font ("Times New Roman", 12));
        warning.setTextFill(Color.GRAY);

        //Vbox for application

        VBox intro = new VBox();
        intro.setAlignment(Pos.TOP_LEFT);
        intro.setPadding(new Insets(20, 20, 20, 20));
        intro.getChildren().addAll(Title, warning);

        //Variables for name and surname

        Label namelab = new Label("Name");
        namelab.setFont(Font.font ("Impact", 12));
        TextField name = new TextField();
        name.setFont(Font.font ("Times New Roman", 15));
        name.setMaxWidth(150);

        Label surlab = new Label("Surname");
        surlab.setFont(Font.font ("Impact", 12));
        TextField surname = new TextField();
        surname.setFont(Font.font ("Times New Roman", 15));
        surname.setMaxWidth(150);

        //Vbox for name and surname

        VBox vbox_name = new VBox();
        vbox_name.getChildren().addAll(namelab, name);

        VBox vbox_surname = new VBox();
        vbox_surname.getChildren().addAll(surlab, surname);



        DatePicker date = new DatePicker();
        date.setMaxWidth(180);
        

        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        // Setting horizontal gap between cells
        gridPane.setVgap(20);
        // Setting vertical gap between cells
        gridPane.setLayoutX(10);
        // Setting the layout X coordinate
        gridPane.setLayoutY(50);
        // Setting the layout Y coordinate

        gridPane.add(vbox_name, 1, 3);
        gridPane.add(vbox_surname, 4, 3);
        gridPane.add(date, 1, 4);


        root.getChildren().addAll(intro,gridPane);

        Scene scene = new Scene(root, 1000, 800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Application");
        primaryStage.show();
    }
}




