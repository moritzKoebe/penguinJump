package doodlejump.Entity;
import java.util.List;

import doodlejump.Control.Settings;
import doodlejump.Control.Vector2D;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Projectile extends Sprite{

    public Projectile(Layer layer, Vector2D location) {
        super(layer, location, new Vector2D(0, Settings.SHOT_VELOCITY), new Vector2D(0, 0), Settings.SHOT_WIDTH, Settings.SHOT_HEIGHT);
    }

    @Override
    public Node createView() {
        return new ImageView(new Image(BouncePlatform.class.getResource("/doodlejump/img/snowball.png").toString(), width, height, false, true));
    }

    public void hit(List<Enemy> enemies)
    {
        enemies.forEach(x -> {
            if(getHighest() < x.getLowest() && getMostLeft() < x.getMostRight() && getMostRight() > x.getMostLeft())
            {
                x.shot();
            }
        });
    }
    
}
