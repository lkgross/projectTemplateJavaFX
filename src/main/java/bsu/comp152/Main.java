package bsu.comp152;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * A minimal GUI application: My First GUI
 * Starting out with Java by Gaddis
 * Modified by Laura K. Gross, laura.gross@bridgew.edu, January, 2021
 */
public class Main extends Application {

    public static void main(String[] args){
        // Launch the application.
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        // Set the window's title.
        primaryStage.setTitle("My First GUI");
        primaryStage.show();

    }



}
