package edu.kis.vh.stacks;

import edu.kis.vh.stacks.stacksImplementations.IStackInterface;

public class StackFIFO extends Stack {

	public StackFIFO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StackFIFO(IStackInterface stack) {
		super(stack);
		// TODO Auto-generated constructor stub
	}

	private final Stack temp = new Stack();

	@Override
	public int pop() {
		while (!isEmpty())

			temp.push(super.pop());

		final int ret = temp.pop();

		while (!temp.isEmpty())

			push(temp.pop());

		return ret;
	}
}
