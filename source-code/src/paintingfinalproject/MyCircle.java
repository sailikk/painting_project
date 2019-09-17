package paintingfinalproject;

import java.awt.geom.Ellipse2D;


public class MyCircle extends MyOval {
    /**
     * Overrides the setElip2d method to be a circle every time.
     * pre: none
     * post: the ellipse is set to circular bounds
     * @param elip2d 
     */
        @Override
	public void setElip2d(Ellipse2D elip2d) {
		elip2d.setFrame(elip2d.getX(), elip2d.getY(), elip2d.getWidth(), elip2d.getWidth());
		super.setElip2d(elip2d);
	}	
}
