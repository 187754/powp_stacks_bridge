package edu.kis.vh.stacks;

import edu.kis.vh.stacks.stacksImplementations.IStackInterface;
import edu.kis.vh.stacks.stacksImplementations.StackList;

public class Stack implements IStackInterface {

	private IStackInterface stack;

	public Stack(IStackInterface stack) {
		super();
		this.stack = stack;
	}

	public Stack() {
		this.stack = new StackList();
	}

	@Override
	public int getTotal() {
		return stack.getTotal();
	}

	@Override
	public void push(int i) {
		stack.push(i);
	}

	@Override
	public boolean isEmpty() {
		return stack.isEmpty();
	}

	@Override
	public boolean isFull() {
		return stack.isFull();
	}

	@Override
	public int top() {
		return stack.top();
	}

	@Override
	public int pop() {
		return stack.pop();
	}

}
// konsekwencją zmiany z punktu 3.1.6. jest możliwość użycia w klasie Stack
// implementacji stostu z klas StackList oraz StackArray bez konieczności zmian
// w klasie Stack
