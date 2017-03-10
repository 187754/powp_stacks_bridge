package edu.kis.vh.stacks.unittests;

import org.junit.Test;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;
import junit.framework.Assert;

public class DefaultStacksFactoryTest {
	@Test
	public void testGetStandardStack() {
		final DefaultStacksFactory factory = new DefaultStacksFactory();
		final Stack s = factory.getStandardStack();
		final String result = s.getClass().toString();
		final String test = "class edu.kis.vh.stacks.Stack";
		Assert.assertEquals(test, result);
	}

	@Test
	public void testGetFalseStack() {
		final DefaultStacksFactory factory = new DefaultStacksFactory();
		final Stack s = factory.getFalseStack();
		final String result = s.getClass().toString();
		final String test = "class edu.kis.vh.stacks.Stack";
		Assert.assertEquals(test, result);
	}

	@Test
	public void testGetFIFOStack() {
		final DefaultStacksFactory factory = new DefaultStacksFactory();
		final StackFIFO s = factory.getFIFOStack();
		final String result = s.getClass().toString();
		final String test = "class edu.kis.vh.stacks.StackFIFO";
		Assert.assertEquals(test, result);
	}

	@Test
	public void testGetHanoiStack() {
		final DefaultStacksFactory factory = new DefaultStacksFactory();
		final StackHanoi s = factory.getHanoiStack();
		final String result = s.getClass().toString();
		final String test = "class edu.kis.vh.stacks.StackHanoi";
		Assert.assertEquals(test, result);
	}
}
