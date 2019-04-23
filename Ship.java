import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import java.util.Random;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Image;

public class Ship extends Sprite {
    
    //private Bat bat;
    private Random random;

    AudioClip hitBatSound;
    AudioClip fallOffSound;

    public Ship (JFrame f,int x, int y, int dx, int dy,int xSize, int ySize,String filename) {
        super(f, x, y, dx, dy, xSize, ySize, filename);
        //bat = b;
        random = new Random();
        setPosition();
        loadClips();
    }

    public void setPosition () {
        //int x = random.nextInt(dimension.width - xSize);
        setX(x);                    // set initial position of ball
        setY(0);
    }

    public boolean isOffScreen () {

        if (y + ySize > dimension.height)
            return true;
        else
            return false;
    }


    public void update () {

        if (!window.isVisible ()) return;
    
    }

    public void loadClips() {

        try {

            hitBatSound = Applet.newAudioClip (
                    getClass().getResource("sounds/hitBat.au"));

            fallOffSound = Applet.newAudioClip (
                    getClass().getResource("sounds/fallOff.au"));

        }
        catch (Exception e) {
            System.out.println ("Error loading sound file: " + e);
        }

    }

    public void playClip (int index) {

        if (index == 1 && hitBatSound != null)
            hitBatSound.play();
        else
        if (index == 2 && fallOffSound != null)
            fallOffSound.play();

    }
}