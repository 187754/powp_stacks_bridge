package edu.kis.vh.stacks;

/**
 * Klasa reprezentująca stos w wariancie opartym na tablicy
 *
 */
public class Stack {
	
	public Stack(StackArray stackArray) {
		super();
		this.stackArray = stackArray;
	}

	public Stack(){
		this.stackArray = new StackArray();
	}
	private StackArray stackArray;
	public int getTotal() {
		return stackArray.getTotal();
	}

	public void push(int i) {
		stackArray.push(i);
	}

	public boolean isEmpty() {
		return stackArray.isEmpty();
	}

	public boolean isFull() {
		return stackArray.isFull();
	}

	public int top() {
		return stackArray.top();
	}

	public int pop() {
		return stackArray.pop();
	}




	

}
