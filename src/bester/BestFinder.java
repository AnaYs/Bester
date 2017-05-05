package bester;

public class BestFinder {

    public Bester bestOf(Bester[] besters) {
        Bester best = besters[0];

        for (int index = 1; index < besters.length; index++) {
            Bester currentBester = besters[index];
            if (currentBester.betterThan(best)) {
                best = currentBester;
            }
        }
        return best;
    }
}
