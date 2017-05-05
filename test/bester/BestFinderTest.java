package bester;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BestFinderTest {

    @Test
    public void shouldFindBestRectangleFromMultipleRectangles() {
        Rectangle[] rectangles = new Rectangle[]{
                new Rectangle(2, 3),
                new Rectangle(5, 5),
                new Rectangle(6, 6)};
        assertEquals(rectangles[2], new BestFinder().bestOf(rectangles));
    }

    @Test
    public void shouldFindBestCookieFromMultipleCookies() {
        Cookie[] cookies = new Cookie[]{
                new Cookie(0),
                new Cookie(5),
                new Cookie(100)};

        assertEquals(cookies[2], new BestFinder().bestOf(cookies));
    }

}
