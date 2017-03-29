package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.stacksImplementations.StackList;

public class StackListTest {
	@Test
	public void testPushElement() {
		final StackList stackObj = new StackList();
		final int testValue = 4;
		stackObj.push(testValue);

		final int result = stackObj.pop();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testEmpty() {
		final StackList stackObj = new StackList();
		final boolean testResult = true;
		boolean result = stackObj.isEmpty();
		Assert.assertEquals(testResult, result);

		final int testValue = 4;
		stackObj.push(testValue);
		final boolean testResult2 = false;
		result = stackObj.isEmpty();
		Assert.assertEquals(testResult2, result);
	}

	@Test
	public void testFull() {
		final StackList stackObj = new StackList();
		final boolean testResult = false;
		boolean result = stackObj.isFull();
		Assert.assertEquals(testResult, result);

		final int testValue = 4;
		stackObj.push(testValue);
		result = stackObj.isFull();
		Assert.assertEquals(testResult, result);
	}

	@Test
	public void testPeek() {
		final StackList stackObj = new StackList();
		int result = stackObj.top();
		final int EMPTY_STACK = 0;
		Assert.assertEquals(EMPTY_STACK, result);
		final int testValue2 = 4;
		stackObj.push(testValue2);
		final int testValue = 3;
		stackObj.push(testValue);
		result = stackObj.top();
		Assert.assertEquals(testValue, result);
		result = stackObj.top();
		Assert.assertEquals(testValue, result);
	}
	// błąd testu wynika z punktu 11

	@Test
	public void testPop() {
		final StackList stackObj = new StackList();
		int result = stackObj.top();
		final int EMPTY_STACK = 0;
		Assert.assertEquals(EMPTY_STACK, result);
		final int testValue2 = 4;
		stackObj.push(testValue2);
		final int testValue = 3;
		stackObj.push(testValue);
		result = stackObj.pop();
		Assert.assertEquals(testValue, result);
		result = stackObj.pop();
		Assert.assertEquals(testValue2, result);
	}
	// błąd testu wynika z punktu 11
}
