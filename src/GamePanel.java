import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel implements Runnable, KeyListener {
    private static final int GAME_WIDTH = 1920, GAME_HEIGHT = 1080;
    private static final int PLAYER_WIDTH = 20, PLAYER_HEIGHT = 20;
    private static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH, GAME_HEIGHT);

    private Player player;
    private Platform platform;

    public GamePanel(){
        player = new Player((GAME_WIDTH/2)-(PLAYER_WIDTH/2), (GAME_HEIGHT/2)-PLAYER_HEIGHT, PLAYER_WIDTH, PLAYER_HEIGHT);
        platform = new Platform((GAME_WIDTH/2)-(GAME_WIDTH/4), GAME_HEIGHT/2, GAME_WIDTH/2, 20);

        this.setFocusable(true);
        this.setPreferredSize(SCREEN_SIZE);
        this.addKeyListener(this);

        Thread gameThread = new Thread(this);
        gameThread.start();
    }

    public void paint(Graphics graphics){
        Image image = createImage(getWidth(), getHeight());
        Graphics graphics1 = image.getGraphics();
        draw(graphics1);
        graphics.drawImage(image, 0, 0, this);
    }

    public void draw(Graphics graphics){
        player.draw(graphics);
        platform.draw(graphics);
    }

    public void move(){

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        long lastTime = System.nanoTime();
        double ns = 1000000000/60.0;
        double delta = 0;
        while(true){
            long now = System.nanoTime();
            delta += (now-lastTime)/ns;
            lastTime = now;
            if(delta >= 1){
                repaint();
                delta--;
            }
        }
    }
}
