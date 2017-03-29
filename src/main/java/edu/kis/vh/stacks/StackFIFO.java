package edu.kis.vh.stacks;

import edu.kis.vh.stacks.stacksImplementations.IStackInterface;
import edu.kis.vh.stacks.stacksImplementations.StackArray;

public class StackFIFO extends Stack {

	public StackFIFO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StackFIFO(IStackInterface stack) {
		super(stack);
		// TODO Auto-generated constructor stub
	}

	private final StackArray temp = new StackArray();

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

// wybrałem StackArray, ponieważ będzie miał szybsze działanie niż ListArray,
// gdyż nie będzie potrzeby tworzenia za każdym razem dodatkowego elementu, a
// jedynie będzie wstawiana wartość

// 3.1.17. zasadę izolacji łamie klasa StackFIFO, gdyż przechowuje obiekt temp
// typu StackArray, co czyni ją zależną od implementacji. Aby to rozwiązać można
// przekazywać parametr do konstruktora w którym wybierana byłaby klasa z której
// ma korzystać temp