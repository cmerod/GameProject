import java.awt.*;

public class Platform extends Rectangle {

    public Platform(int x, int y, int width, int height){
        super(x,y,width,height);
    }

    public void draw(Graphics graphics){
        graphics.setColor(Color.WHITE);
        graphics.fillRect(x,y,width,height);
    }
}
