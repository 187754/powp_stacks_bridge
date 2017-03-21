package edu.kis.vh.stacks.stacksImplementations;

public interface IStackInterface {
	static final int EMPTY_STACK = -1;

	public int getTotal();

	public void push(int i);

	public boolean isEmpty();

	public boolean isFull();

	public int top();

	public int pop();
}
