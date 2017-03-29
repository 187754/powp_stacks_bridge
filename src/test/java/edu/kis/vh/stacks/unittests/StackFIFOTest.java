package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.Stack;

public class StackFIFOTest {

	@Test
	public void testPop() {
		final Stack stackObj = new Stack();
		final int EMPTY_STACK_VALUE = 0;

		int result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		final int testValue = 4;
		stackObj.push(testValue);

		result = stackObj.pop();
		Assert.assertEquals(testValue, result);
		result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

}
// błąd testu wynika z punktu, w którym zmieniona została wartość
// EMPTY_STACK_VALUE z -1 na 0 (punkt 11)