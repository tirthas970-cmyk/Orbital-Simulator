package orbitsim.models;

import javafx.scene.shape.Circle;
import javafx.scene.paint.Color; 


public class Planet {
    private Circle sprite;
    private double xVelocity = 2;
    private double yVelocity = 1.5;

    private double radius;
    private double angle;

    public Planet(double startX, double startY, Color color) {
        this.sprite = new Circle(15.0);
        
        this.sprite.setLayoutX(startX);
        this.sprite.setLayoutY(startY);
        this.sprite.setFill(color);

        double distanceX = startX - 400;
        double distanceY = startY - 300;

        this.angle = Math.atan2(distanceY, distanceY);
        this.radius = Math.sqrt(Math.pow(distanceX, 2) + Math.pow(distanceY, 2));

    }
    
    public Circle getView() {
        return this.sprite;
    }

    public void move() {
        this.sprite.setLayoutX(this.sprite.getLayoutX() + xVelocity);
        this.sprite.setLayoutY(this.sprite.getLayoutY() + yVelocity);
    }

    /**
     * Moves the planet in a circular orbit
     * 
     */
    public void circularOrbit(double increment) {
        this.sprite.setLayoutX(400 + Math.cos(this.angle) * this.radius);
        this.sprite.setLayoutY(300 + Math.sin(this.angle) * this.radius);

        this.angle += 0.02;



    }
}
    
    

