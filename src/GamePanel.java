import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    private static final int GAME_WIDTH = 1920, GAME_HEIGHT = 1080;
    private static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH, GAME_HEIGHT);

    public GamePanel(){
        this.setFocusable(true);
        this.setPreferredSize(SCREEN_SIZE);
    }
}
