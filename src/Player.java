import java.awt.*;

public class Player extends Rectangle {

    public Player(int x, int y, int width, int height){
        super(x,y,width,height);
    }

    public void draw(Graphics graphics){
        graphics.setColor(Color.WHITE);
        graphics.fillRect(x,y,width,height);
    }
}
