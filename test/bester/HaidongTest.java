package bester;

import org.junit.Test;
import org.w3c.dom.css.Rect;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HaidongTest {

    @Test
    public void shouldReturnBestRectangleFromMultipleRectangles() {
        Rectangle[] rectangles = new Rectangle[]{
                new Rectangle(2, 3),
                new Rectangle(5, 5),
                new Rectangle(6, 6)};
        assertEquals(rectangles[2], new Haidong().bestOf(rectangles));
    }
}
