package edu.kis.vh.stacks.stacksImplementations;

public interface IStackInterface {
	static final int EMPTY_STACK = 0;

	public int getTotal();

	public void push(int i);

	public boolean isEmpty();

	public boolean isFull();

	public int top();

	public int pop();
}
// realizacja zadania 3.1.10 pomogła w realizacji zadania 3.1.11

// 3.1.13:
// F3 przenosi do deklaracji metody, ctrl+t wyświetla hierachię implementacji
// danej metody wraz z korzeniem i wszystkimi implementacjami, zaś myszka + ctrl
// pozwala na wybór dowolnej z wymienionych wcześniej opcji