package edu.kis.vh.stacks;

import edu.kis.vh.stacks.stacksImplementations.IStackInterface;

public class StackHanoi extends Stack {

	public StackHanoi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StackHanoi(IStackInterface stack) {
		super(stack);
		// TODO Auto-generated constructor stub
	}

	private int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void push(int in) {
		if (!isEmpty() && (in > top()))
			totalRejected++;
		else
			super.push(in);
	}
}
