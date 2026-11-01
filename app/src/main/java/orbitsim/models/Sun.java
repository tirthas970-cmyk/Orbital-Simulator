package orbitsim.models;

import javafx.scene.shape.Circle;
import javafx.scene.paint.Color; 


public class Sun {
    private Circle sprite;

    public Sun() {
        this.sprite = new Circle(30);
        
        this.sprite.setLayoutX(400);
        this.sprite.setLayoutY(300);
        this.sprite.setFill(Color.YELLOW);
    }
    
    public Circle getView() {
        return this.sprite;
    }

}


    
    

