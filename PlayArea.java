import java.util.Random;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.event.*;
import java.awt.*;
/**
 * Write a description of class PlayArea here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PlayArea
{
    private int xSize;
    private int ySize;
    private int x;
    private int y;
    
    public PlayArea(int x, int y, int xs, int ys){
        xSize = xs;
        ySize = ys;
        this.x = x;
        this.y = y;
    }
    
    public void draw(Graphics2D g){
        g.setColor(Color.RED);
        g.fill(new Rectangle2D.Double(x,y,xSize,ySize));
    }
}
