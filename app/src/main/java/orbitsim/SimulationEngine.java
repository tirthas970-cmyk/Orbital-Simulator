package orbitsim;

import javafx.animation.AnimationTimer;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import orbitsim.models.Planet;
import java.util.ArrayList;

public class SimulationEngine {
    private ArrayList<Planet> planets = new ArrayList<>();
    private AnimationTimer timer;
    double angle = 0;


    public SimulationEngine(Pane gamePane) {
        Planet earth = new Planet(200, 200, Color.BLUE);
        planets.add(earth);
        
        gamePane.getChildren().add(earth.getView());

        this.timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                for (Planet p : planets) {
                    p.circularOrbit(angle);

                }
                angle += 0.02;
            }
        };
    }

    public void start() {
        timer.start();
    }
}
