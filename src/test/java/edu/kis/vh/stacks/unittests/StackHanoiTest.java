package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackHanoi;

public class StackHanoiTest {
	@Test
	public void testReportRejected() {
		final StackHanoi stackObj = new StackHanoi();
		final int testReport = 0;
		final int testReport1 = 1;
		final int testValue = 4;
		stackObj.push(testValue);
		int report = stackObj.reportRejected();
		Assert.assertEquals(report, testReport);
		stackObj.push(testValue + 3);
		report = stackObj.reportRejected();
		Assert.assertEquals(report, testReport1);
		stackObj.push(testValue - 3);
		report = stackObj.reportRejected();

		Assert.assertEquals(report, testReport1);
	}

	@Test
	public void testPush() {
		final Stack stackObj = new Stack();
		final int testValue = 4;
		stackObj.push(testValue);

		final int result = stackObj.top();
		Assert.assertEquals(testValue, result);
	}

}
