package edu.kis.vh.stacks;

public class Stack {

	private static final int FULL_STACK = 11;

	private static final int EMPTY_STACK = -1;

	private int[] items = new int[FULL_STACK + 1];

	public int total = EMPTY_STACK;

	public void push(int i) {
		if (!isFull())
			items[++total] = i;
	}

	public boolean isEmpty() {
		return total == EMPTY_STACK;
	}

	public boolean isFull() {
		return total == FULL_STACK;
	}

	public int top() {
		if (isEmpty())
			return EMPTY_STACK;
		return items[total];
	}

	public int pop() {
		if (isEmpty())
			return EMPTY_STACK;
		return items[total--];
	}

}
