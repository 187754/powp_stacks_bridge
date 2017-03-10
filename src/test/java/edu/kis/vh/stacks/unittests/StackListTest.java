package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.list.StackList;

public class StackListTest {
	@Test
	public void testPushElement() {
		final StackList stackObj = new StackList();
		final int testValue = 4;
		stackObj.pushElement(testValue);

		final int result = stackObj.pop();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testEmpty() {
		final StackList stackObj = new StackList();
		final boolean testResult = true;
		boolean result = stackObj.empty();
		Assert.assertEquals(testResult, result);

		final int testValue = 4;
		stackObj.pushElement(testValue);
		final boolean testResult2 = false;
		result = stackObj.empty();
		Assert.assertEquals(testResult2, result);
	}

	@Test
	public void testFull() {
		final StackList stackObj = new StackList();
		final boolean testResult = false;
		boolean result = stackObj.full();
		Assert.assertEquals(testResult, result);

		final int testValue = 4;
		stackObj.pushElement(testValue);
		result = stackObj.full();
		Assert.assertEquals(testResult, result);
	}

	@Test
	public void testPeek() {
		final StackList stackObj = new StackList();
		int result = stackObj.peek();
		final int EMPTY_STACK = -1;
		Assert.assertEquals(EMPTY_STACK, result);
		final int testValue2 = 4;
		stackObj.pushElement(testValue2);
		final int testValue = 3;
		stackObj.pushElement(testValue);
		result = stackObj.peek();
		Assert.assertEquals(testValue, result);
		result = stackObj.peek();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testPop() {
		final StackList stackObj = new StackList();
		int result = stackObj.peek();
		final int EMPTY_STACK = -1;
		Assert.assertEquals(EMPTY_STACK, result);
		final int testValue2 = 4;
		stackObj.pushElement(testValue2);
		final int testValue = 3;
		stackObj.pushElement(testValue);
		result = stackObj.pop();
		Assert.assertEquals(testValue, result);
		result = stackObj.pop();
		Assert.assertEquals(testValue2, result);
	}
}
