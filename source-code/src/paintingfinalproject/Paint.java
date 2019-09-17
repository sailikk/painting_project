package paintingfinalproject;

import java.awt.Point;


public interface Paint {
        /**
         * Draws the appropriate object, takes into account start and end drag points and executes
         * depending on the shape type
         * pre: none
         * pre: the appropriate object is drawn
         * @param g 
         */
	public void draw(GraphicAdapter g);
        
        /**
         * Makes an shape of the appropriate type and sets it to that shape, depending on the start and end values of drag
         * pre: none
         * post: the shape configurations are stored
         * @param startDrag
         * @param endDrag 
         */
	public void makeObject(Point startDrag, Point endDrag);
}