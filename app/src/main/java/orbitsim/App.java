package orbitsim;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane; // Changed from StackPane
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import orbitsim.models.Planet;
import javafx.scene.paint.Color; 


public class App extends Application {

    @Override
    public void start(Stage stage) {
        Pane root = new Pane();
        root.setStyle("-fx-background-color: black;"); // Set space to black

        Planet planet = new Planet(400, 300, Color.RED);

        Label label = new Label("Welcome to Orbit Simulator!");
        label.setTextFill(Color.WHITE);
        label.setLayoutX(20); // Position it in the top left corner
        label.setLayoutY(20);

        root.getChildren().add(label);
        root.getChildren().add(planet.getView());

        Scene scene = new Scene(root, 800, 600);

        stage.setTitle("Orbit Simulator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
