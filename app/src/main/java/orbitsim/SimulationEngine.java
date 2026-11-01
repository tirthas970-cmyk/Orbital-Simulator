package orbitsim;

import javafx.animation.AnimationTimer;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import orbitsim.models.Planet;
import java.util.ArrayList;
import orbitsim.models.Sun;

public class SimulationEngine {
    private ArrayList<Planet> planets = new ArrayList<>();
    private AnimationTimer timer;
    double angle = 0;

    public SimulationEngine(Pane gamePane) {
        Planet mercury = new Planet(400, 240, Color.GRAY);    
    Planet venus   = new Planet(480, 300, Color.ORANGE);     
    Planet earth   = new Planet(250, 300, Color.BLUE);     
    Planet mars    = new Planet(400, 480, Color.RED);       

    Planet jupiter = new Planet(150, 100, Color.BROWN);      
    Planet saturn  = new Planet(650, 100, Color.GOLD);       
    Planet uranus  = new Planet(150, 500, Color.LIGHTBLUE);  
    Planet neptune = new Planet(650, 500, Color.DARKBLUE);  

        planets.add(earth);
        planets.add(venus);
        planets.add(mercury);
        planets.add(mars);
        planets.add(jupiter);
        planets.add(saturn);
        planets.add(uranus);
        planets.add(neptune);

        Sun sun = new Sun();
        gamePane.getChildren().add(earth.getView());
        gamePane.getChildren().add(sun.getView());
        gamePane.getChildren().add(mercury.getView());
        gamePane.getChildren().add(venus.getView());
        gamePane.getChildren().add(neptune.getView());
        gamePane.getChildren().add(saturn.getView());
        gamePane.getChildren().add(uranus.getView());
        gamePane.getChildren().add(mars.getView());
        gamePane.getChildren().add(jupiter.getView());

        this.timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                for (Planet p : planets) {
                    p.circularOrbit(0.05);

                }
            }
        };
    }

    public void start() {
        timer.start();
    }
}
