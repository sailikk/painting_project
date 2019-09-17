package paintingfinalproject;

import java.awt.Color;
import java.awt.Point;
import java.awt.geom.Ellipse2D;

public class MyOval implements Paint {

    private Ellipse2D elip2d;
    private Color color;
    
    /**
     * constructor for this oval object
     * pre: none
     * post: sets color to the appropriate null type, makes an oval object
     */
    public MyOval() {
        this.color = null;
    }
    
    //read the paint interface for documentaion
    @Override
    public void makeObject(Point startDrag, Point endDrag) {
        Ellipse2D r = new Ellipse2D.Float(Math.min(startDrag.x, endDrag.x), Math.min(startDrag.y, endDrag.y), Math.abs(startDrag.x - endDrag.x), Math.abs(startDrag.y - endDrag.y));
        this.setElip2d(r);
    }
    
    //read the paint interface for documentaion
    @Override
    public void draw(GraphicAdapter g) {
        if (getColor() == null) {
            g.getGraphicAdapter().drawOval((int) getElip2d().getX(), (int) getElip2d().getY(), (int) getElip2d().getWidth(), (int) getElip2d().getHeight());
        } else {
            g.getGraphicAdapter().setColor(getColor());
            g.getGraphicAdapter().fillOval((int) getElip2d().getX(), (int) getElip2d().getY(), (int) getElip2d().getWidth(), (int) getElip2d().getHeight());
        }
    }
    
    /**
     * getter for the ellipse shape
     * pre: none
     * post: returns the ellipse
     * @return 
     */
    public Ellipse2D getElip2d() {
        return elip2d;
    }
    
    /**
     * setter for the ellipse shape
     * pre: none
     * post: sets the ellipse shape to the given ellipse argument
     * @param elip2d 
     */
    public void setElip2d(Ellipse2D elip2d) {
        this.elip2d = elip2d;
    }
    
    /**
     * getter for the color
     * pre: none
     * post: the color value is returned
     * @return 
     */
    public Color getColor() {
        return color;
    }
    
    /**
     * setter for the color
     * pre: none
     * post: the color value is set to the passed argument
     * @param color 
     */
    public void setColor(Color color) {
        this.color = color;
    }

}
