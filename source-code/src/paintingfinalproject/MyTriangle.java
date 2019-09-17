package paintingfinalproject;

import java.awt.Color;
import java.awt.Point;
import java.awt.Polygon;

public class MyTriangle implements Paint {

    private Polygon triangle;
    private Color color;
    
    /**
     * constructor for this triangle object
     * pre: none
     * post: sets color to the appropriate null type, makes a triangle object
     */
    public MyTriangle() {
        this.color = null;
    }
    
    //read the paint interface for documentaion
    @Override
    public void makeObject(Point startDrag, Point endDrag) {
        int midx;
        int midy;
        if (startDrag.x > endDrag.x) {
            midx = endDrag.x + (Math.abs(startDrag.x - endDrag.x));
            midy = endDrag.y;
        } else {
            midx = endDrag.x - (Math.abs(startDrag.x - endDrag.x));
            midy = endDrag.y;
        }
        int[] xs = {startDrag.x, endDrag.x, midx};
        int[] ys = {startDrag.y, endDrag.y, midy};
        Polygon pol = new Polygon(xs, ys, xs.length);
        this.setTriangle(pol);
    }
    
    //read the paint interface for documentaion
    @Override
    public void draw(GraphicAdapter g) {
        if (getColor() == null) {
            g.getGraphicAdapter().drawPolygon(getTriangle());
        } else {
            g.getGraphicAdapter().setColor(getColor());
            g.getGraphicAdapter().fillPolygon(getTriangle());
        }
    }
    
    /**
     * getter for the triangle shape
     * pre: none
     * post: returns the triangle
     * @return 
     */
    public Polygon getTriangle() {
        return triangle;
    }
    
    /**
     * setter for the triangle shape
     * pre: none
     * post: sets the triangle shape to the given triangle argument
     * @param triangle 
     */
    public void setTriangle(Polygon triangle) {
        this.triangle = triangle;
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
