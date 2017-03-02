package edu.kis.vh.stacks.list;

public class Node {

	private int value; // wszystkie użycia zmiennej zostały zmienione na użycia
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
