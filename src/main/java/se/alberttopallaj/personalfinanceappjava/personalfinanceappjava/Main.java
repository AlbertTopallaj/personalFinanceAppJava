package se.alberttopallaj.personalfinanceappjava.personalfinanceappjava;

import javafx.application.Application;
import javafx.stage.Stage;
import se.alberttopallaj.personalfinanceappjava.personalfinanceappjava.UI.LoginScene;
import se.alberttopallaj.personalfinanceappjava.personalfinanceappjava.models.DataStore;

// Importerade bibliotek samt importerad klass så att det går att koppla de samman.


public class Main extends Application {  // Main klassen, vad som ska köras
    @Override // Oklart
    public void start(Stage primaryStage) { // Metoden som ska köras när appen startas
        DataStore.loadTransactions();
        LoginScene login = new LoginScene(); // En logga in sida
        primaryStage.setScene(login.create(primaryStage)); // Man sätter första scenen som logga in scenen
        primaryStage.setTitle("Personal Finance App"); // Titeln för applikationen är Personal Finance APP
        primaryStage.show(); // Visar primaryStage
    }

    public static void main(String[] args) { // Metod för att starta
        launch(args); // Startar applikationen
    }
}


