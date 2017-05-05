package bester;

public class Haidong {

    public Rectangle bestOf(Rectangle[] rectangles) {
        Rectangle best = rectangles[0];

        for (int index = 1; index < rectangles.length; index++) {
            Rectangle currentRectangle = rectangles[index];
            if (currentRectangle.betterThan(best)) {
                best = currentRectangle;
            }
        }
        return best;
    }
}
