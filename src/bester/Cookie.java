package bester;

public class Cookie implements Bester {

    private int numberOfChocolateChips;

    public Cookie(int numberOfChocolateChips) {
        this.numberOfChocolateChips = numberOfChocolateChips;
    }

    public boolean betterThan(Bester otherCookie) {
        return numberOfChocolateChips > ((Cookie) otherCookie).numberOfChocolateChips;
    }
}
