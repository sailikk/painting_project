package paintingfinalproject;

import java.awt.Graphics;
import java.awt.Graphics2D;

abstract class GraphicAdapter {

    private Graphics2D GraphicAdapter;

    /**
     * Constructor for the graphics adapter. 
     * pre: none 
     * post: graphics adapter created, default graphics
     */
    public GraphicAdapter() {
    }
    
    /**
     * getter for the graphics set into the graphics adapter object
     * pre: none
     * post: appropriate graphics stored in the state of the object returned.
     * @return 
     */
    public Graphics2D getGraphicAdapter() {
        return GraphicAdapter;
    }
    
    /**
     * setter for the graphics of the object.
     * pre: none
     * post: the graphicAdapter is set tho that of the given graphics2D adapter
     * @param graphicAdapter 
     */
    public void setGraphicAdapter(Graphics2D graphicAdapter) {
        GraphicAdapter = graphicAdapter;
    }
    
    /**
     * setter for the graphics of the object.
     * pre: none
     * post: the graphicAdapter is set tho that of the given graphics adapter
     * @param graphicAdapter 
     */
    public void setGraphicAdapter(Graphics graphicAdapter) {
        GraphicAdapter = (Graphics2D) graphicAdapter;
    }

}
