package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    public static final int VAL = 12;
    public static final int RET = -1;
    public static final int VAL2 = 11;

    private int[] numbers = new int[VAL];

    public int total = RET;

    public void CountIn(int in) {
        if (!IsFull())
            numbers[++total] = in;
    }

    public boolean CallCheck() {
        return total == RET;
    }

    public boolean IsFull() {
        return total == VAL2;
    }

    protected int Peekaboo() {
        if (CallCheck())
            return RET;
        return numbers[total];
    }

    public int CountOut() {
        if (CallCheck())
            return RET;
        return numbers[total--];
    }

}
