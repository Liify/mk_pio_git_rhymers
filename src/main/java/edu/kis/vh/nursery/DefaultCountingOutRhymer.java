package edu.kis.vh.nursery;

/**
 * Klasa implementująca standardową wyliczankę.
 */
public class DefaultCountingOutRhymer {
    public static final int VAL = 12;
    public static final int RET = -1;
    public static final int VAL2 = 11;

    private final int[] numbers = new int[VAL];

    public int total = RET;

    /**
     * Dodaje nową wartość do wyliczanki.
     *
     * @param in wartość do dodania
     */
    public void CountIn(int in) {
        if (!IsFull())
            numbers[++total] = in;
    }

    /**
     * Sprawdza, czy wyliczanka jest pusta.
     *
     * @return true jeśli pusta, w przeciwnym razie false
     */
    public boolean CallCheck() {
        return total == RET;
    }

    /**
     * Sprawdza, czy wyliczanka jest pełna.
     *
     * @return true jeśli pełna, w przeciwnym razie false
     */
    public boolean IsFull() {
        return total == VAL2;
    }

    /**
     * Zwraca ostatnio dodaną wartość bez jej usuwania.
     *
     * @return ostatnia wartość lub -1 (RET) jeśli wyliczanka jest pusta
     */
    protected int Peekaboo() {
        if (CallCheck())
            return RET;
        return numbers[total];
    }

    /**
     * Zwraca i usuwa ostatnio dodaną wartość z wyliczanki.
     *
     * @return usunięta wartość lub -1 (RET) jeśli wyliczanka jest pusta
     */
    public int CountOut() {
        if (CallCheck())
            return RET;
        return numbers[total--];
    }

}