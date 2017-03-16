package edu.kis.vh.stacks.list;

import edu.kis.vh.stacks.IStackInterface;

public class StackList implements IStackInterface{
	private class Node {

		private final int value; // wszystkie użycia zmiennej zostały zmienione
									// na
									// użycia
		// poprzez getter i setter (klasa StackList)
		private Node prev;
		private Node next;// tak samo jak w przypadku value

		public Node(int i) {
			value = i;
		}

		public int getValue() {
			return value;
		} 

		public Node getPrev() {
			return prev;
		}

		public void setPrev(Node prev) {
			this.prev = prev;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}

	private static final int EMPTY_STACK = -1;
	private Node last;
	int i;
	int total = 0;

	@Override
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
		total++;
	}

	@Override
	public boolean isEmpty() {
		return last == null;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public int top() {
		if (isEmpty())
			return EMPTY_STACK;
		return last.getValue();
	}

	@Override
	public int pop() {
		if (isEmpty())
			return EMPTY_STACK;
		final int ret = last.getValue();
		last = last.getPrev();
		total--;
		return ret;
	}
	
	@Override
	public int getTotal(){
		return total;
	}
	
	
	

}

//użyte w 3.1.4.:
//rename
//ustawione w save actions automatycznie organizowanie importów
//szybka poprawa błędów (zmiana klasy parametru)
