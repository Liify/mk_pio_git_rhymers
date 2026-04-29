package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;
    public int getTotalRejected() { return totalRejected; }
    public int ReportRejected() {
        return totalRejected;
    }

    @Override
    public void CountIn(int in) {
        if (!CallCheck() && in > Peekaboo()) {
            totalRejected++;
        }

        else {
            super.CountIn(in);
        }
    }
}
