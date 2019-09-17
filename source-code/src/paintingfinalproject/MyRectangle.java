package paintingfinalproject;

import java.awt.*;

public class MyRectangle implements Paint {

    private Rectangle rect;
    private Color color;
    
    /**
     * constructor for this rectangle object
     * pre: none
     * post: sets color to the appropriate null type, makes a rectangle object
     */
    public MyRectangle() {
        this.color = null;

    }
    
    //read the paint interface for documentaion
    @Override
    public void makeObject(Point startDrag, Point endDrag) {
        Rectangle r = new Rectangle(Math.min(startDrag.x, endDrag.x), Math.min(startDrag.y, endDrag.y), Math.abs(startDrag.x - endDrag.x), Math.abs(startDrag.y - endDrag.y));
        this.setRect(r);
    }
    
    //read the paint interface for documentaion
    @Override
    public void draw(GraphicAdapter g) {
        if (getColor() == null) {
            g.getGraphicAdapter().drawRect(this.getRect().x, this.getRect().y, this.getRect().width, this.getRect().height);
        } else {
            g.getGraphicAdapter().setColor(this.getColor());
            g.getGraphicAdapter().fillRect(this.getRect().x, this.getRect().y, this.getRect().width, this.getRect().height);
            g.getGraphicAdapter().drawRect(this.getRect().x, this.getRect().y, this.getRect().width, this.getRect().height);
        }
    }
    
    /**
     * getter for the rectangle shape
     * pre: none
     * post: returns the rectangle
     * @return 
     */
    public Rectangle getRect() {
        return rect;
    }
    
    /**
     * setter for the rectangle shape
     * pre: none
     * post: sets the ellipse shape to the given rectangle argument 
     * @param rect
     */
    public void setRect(Rectangle rect) {
        this.rect = rect;
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
