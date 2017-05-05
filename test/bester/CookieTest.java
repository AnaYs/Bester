package bester;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CookieTest {
    @Test
    public void shouldDetermineIfBetterThanOtherCookie() throws Exception {
        assertTrue(new Cookie(4).betterThan(new Cookie(2)));
    }
}
