package edu.kis.vh.nursery;

/**
 * Klasa implementująca standardową wyliczankę.
 */
public class DefaultCountingOutRhymer {
    public static final int VAL = 12;
    public static final int RET = -1;
    public static final int VAL2 = 11;
    public static final int EMPTY = -1;

    private final int[] numbers = new int[VAL];

    private int total = EMPTY;
    public int getTotal() { return total; }

    /**
     * Dodaje nową wartość do wyliczanki.
     *
     * @param in wartość do dodania
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Sprawdza, czy wyliczanka jest pusta.
     *
     * @return true jeśli pusta, w przeciwnym razie false
     */
    public boolean callCheck() {
        return total == EMPTY;
    }

    /**
     * Sprawdza, czy wyliczanka jest pełna.
     *
     * @return true jeśli pełna, w przeciwnym razie false
     */
    public boolean isFull() {
        return total == VAL2;
    }

    /**
     * Zwraca ostatnio dodaną wartość bez jej usuwania.
     *
     * @return ostatnia wartość lub -1 (RET) jeśli wyliczanka jest pusta
     */
    protected int peekaboo() {
        if (callCheck())
            return RET;
        return numbers[total];
    }

    /**
     * Zwraca i usuwa ostatnio dodaną wartość z wyliczanki.
     *
     * @return usunięta wartość lub -1 (RET) jeśli wyliczanka jest pusta
     */
    public int countOut() {
        if (callCheck())
            return RET;
        return numbers[total--];
    }

}