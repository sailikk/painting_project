package paintingfinalproject;

import java.awt.Rectangle;

public class MySquare extends MyRectangle {
    /**
     * Overrides the setRect method to be a square every time.
     * pre: none
     * post: the rectangle is set to square bounds 
     */
        @Override
	public void setRect(Rectangle rect) {
		rect.setBounds(rect.x, rect.y , rect.width, rect.width);
		super.setRect(rect);
	}
}
