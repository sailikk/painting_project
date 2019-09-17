/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintingfinalproject;

/**
 *
 * @author sailikk
 */
import java.awt.Color;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.LinkedList;
import java.util.Queue;

public class FloodFiller {
    
    /**
     * Static method using a queue structure in order to fill enclosures. 
     * Acts the same as the fill tool in MS paint.
     * 
     * pre: none
     * post: the appropriate enclosure has been filled
     * @param image
     * @param x
     * @param y
     * @param color 
     */
    public static void floodFillImage(BufferedImage image, int x, int y, Color color) {
        int srcColor = image.getRGB(x, y);
        boolean[][] hits = new boolean[image.getHeight()][image.getWidth()];

        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x, y));

        while (!queue.isEmpty()) {
            Point p = queue.remove();

            if (floodFillImageDo(image, hits, p.x, p.y, srcColor, color.getRGB())) {
                queue.add(new Point(p.x, p.y - 1));
                queue.add(new Point(p.x, p.y + 1));
                queue.add(new Point(p.x - 1, p.y));
                queue.add(new Point(p.x + 1, p.y));
            }
        }
    }
    
    /**
     * Helper method that makes sure to terminate the queue structure in spots where it should be.
     * pre: none
     * post: the queue structure in a certain row or column is taken care of, terminated so to be able to use memory in other useful places.
     * @param image
     * @param hits
     * @param x
     * @param y
     * @param srcColor
     * @param tgtColor
     * @return 
     */
    private static boolean floodFillImageDo(BufferedImage image, boolean[][] hits, int x, int y, int srcColor, int tgtColor) {
        if (y < 0) {
            return false;
        }
        if (x < 0) {
            return false;
        }
        if (y > image.getHeight() - 1) {
            return false;
        }
        if (x > image.getWidth() - 1) {
            return false;
        }

        if (hits[y][x]) {
            return false;
        }

        if (image.getRGB(x, y) != srcColor) {
            return false;
        }

        // valid, paint it
        image.setRGB(x, y, tgtColor);
        hits[y][x] = true;
        return true;
    }

}
