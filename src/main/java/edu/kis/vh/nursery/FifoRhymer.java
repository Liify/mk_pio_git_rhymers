package edu.kis.vh.nursery;

public class FifoRhymer extends DefaultCountingOutRhymer {

    private DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();
    public DefaultCountingOutRhymer getTemp() { return temp; }

    @Override
    public int CountOut() {
        while (!CallCheck())
            temp.CountIn(super.CountOut());

        int ret = temp.CountOut();

        while (!temp.CallCheck())
            CountIn(temp.CountOut());

        return ret;
    }
}
