package orbitsim;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane; // Changed from StackPane
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import orbitsim.models.Planet;
import orbitsim.models.Sun;


public class App extends Application {

    @Override
    public void start(Stage stage) {
    Pane root = new Pane();
    root.setStyle("-fx-background-color: black;");

    SimulationEngine engine = new SimulationEngine(root);
    engine.start(); 

    Scene scene = new Scene(root, 800, 600);
    stage.setScene(scene);
    stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
