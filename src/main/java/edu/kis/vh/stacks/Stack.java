package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;

/**
 * Klasa reprezentująca stos w wariancie opartym na tablicy
 *
 */
public class Stack implements IStackInterface {
	
	private IStackInterface stack;
	
	
	public Stack(StackList stack) {
		super();
		this.stack = stack;
	}

	public Stack(){
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
