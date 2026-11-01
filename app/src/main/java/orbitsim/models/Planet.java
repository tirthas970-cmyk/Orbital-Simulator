package orbitsim.models;

import javafx.scene.shape.Circle;
import javafx.scene.paint.Color; 


public class Planet {
    private Circle sprite;
    private double xVelocity = 0;
    private double yVelocity = 0;

    public Planet(double startX, double startY, Color color) {
        this.sprite = new Circle(15.0);
        
        this.sprite.setLayoutX(startX);
        this.sprite.setLayoutY(startY);
        this.sprite.setFill(color);
    }
    
    public Circle getView() {
        return this.sprite;
    }

    public void move() {
        this.sprite.setLayoutX(this.sprite.getLayoutX() + xVelocity);
        this.sprite.setLayoutY(this.sprite.getLayoutY() + yVelocity);
    }
}
    
    

