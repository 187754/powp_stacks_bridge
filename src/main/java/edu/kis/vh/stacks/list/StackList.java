package edu.kis.vh.stacks.list;

public class StackList {
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

	public void pushElement(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	public boolean empty() {
		return last == null;
	}

	public boolean full() {
		return false;
	}

	public int peek() {
		if (empty())
			return EMPTY_STACK;
		return last.getValue();
	}

	public int pop() {
		if (empty())
			return EMPTY_STACK;
		final int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}
