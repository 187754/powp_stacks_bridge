package edu.kis.vh.stacks;

public class StackArray {

	/**
	 * ilość elementów pełnego stosu
	 * 
	 */
	private static final int FULL_STACK_INDICATOR = 11;

	/**
	 * wartość zwracana, gdy stos jest pusty
	 * 
	 */
	private static final int EMPTY_STACK = -1;

	/**
	 * tablica przechowująca elementy stosu
	 * 
	 */
	private final int[] items = new int[FULL_STACK_INDICATOR + 1];

	/**
	 * wskaźnik stosu
	 */
	private int total = EMPTY_STACK;

	/**
	 * @return zwraca ilość elementów, które znajdują się na stosie
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * dokłada element na stos
	 * 
	 * @param i
	 *            wartość elementu, który ma zostać odłożony na stos
	 */
	public void push(int i) {
		if (!isFull())
			items[++total] = i;
	}

	/**
	 * sprawdza czy stos jest pusty
	 * 
	 * @return true - gdy stos jest pusty, false w przeciwnym wypadku
	 */
	public boolean isEmpty() {
		return total == EMPTY_STACK;
	}

	/**
	 * sprawdza czy stos jest pełen
	 * 
	 * @return true gdy stos jest pełen, false w przeciwnym wypadku
	 */
	public boolean isFull() {
		return total == FULL_STACK_INDICATOR;
	}

	/**
	 * zwraca wartość z wierzchołka stosu bez usuwania jej ze stosu
	 * 
	 * @return EMPTY_STACK gdy stos jest pusty, w przeciwnym wypadku wartość
	 *         elementu ze szczytu stosu
	 *
	 */
	public int top() {
		if (isEmpty())
			return EMPTY_STACK;
		return items[total];
	}

	/**
	 * pobiera wartość ze stosu, usuwając ją z niego równocześnie
	 * 
	 * @return EMPTY_STACK gdy stos jest pusty, w przeciwnym wypadku wartość
	 *         elementu ze szczytu stosu
	 * 
	 */
	public int pop() {
		if (isEmpty())
			return EMPTY_STACK;
		return items[total--];
	}
}
