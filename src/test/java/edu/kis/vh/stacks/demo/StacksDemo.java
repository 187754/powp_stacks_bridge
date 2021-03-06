package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.ArrayStacksFactory;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;

public class StacksDemo {

	private static final int RANDOM_RANGE = 20;
	private static final int COUNT_OF_NUMBERS = 15;
	private static final int COUNT_OF_STACKS = 3;

	public static void main(String[] args) {
		final DefaultStacksFactory factory = new DefaultStacksFactory();
		final ArrayStacksFactory factoryArray = new ArrayStacksFactory();
		testStacks(factory);
		testStacksArray(factoryArray);
	}

	private static void testStacks(final DefaultStacksFactory factory) {
		final Stack[] stacks = { factory.getStandardStack(), factory.getFalseStack(), factory.getFIFOStack(),
				factory.getHanoiStack() };

		for (int i = 1; i < COUNT_OF_NUMBERS; i++)
			for (int j = 0; j < COUNT_OF_STACKS; j++)
				stacks[j].push(i);

		final java.util.Random rn = new java.util.Random();
		for (int i = 1; i < COUNT_OF_NUMBERS; i++)
			stacks[3].push(rn.nextInt(RANDOM_RANGE));

		for (int i = 0; i < stacks.length; i++) {
			while (!stacks[i].isEmpty())
				System.out.print(stacks[i].pop() + "  ");
			System.out.println();
		}

		System.out.println("total rejected is " + ((StackHanoi) stacks[3]).reportRejected());
	}

	private static void testStacksArray(final ArrayStacksFactory factory) {
		final Stack[] stacks = { factory.getStandardStack(), factory.getFalseStack(), factory.getFIFOStack(),
				factory.getHanoiStack() };

		for (int i = 1; i < COUNT_OF_NUMBERS; i++)
			for (int j = 0; j < COUNT_OF_STACKS; j++)
				stacks[j].push(i);

		final java.util.Random rn = new java.util.Random();
		for (int i = 1; i < COUNT_OF_NUMBERS; i++)
			stacks[3].push(rn.nextInt(RANDOM_RANGE));

		for (int i = 0; i < stacks.length; i++) {
			while (!stacks[i].isEmpty())
				System.out.print(stacks[i].pop() + "  ");
			System.out.println();
		}

		System.out.println("total rejected is " + ((StackHanoi) stacks[3]).reportRejected());
	}

}

// Punkty 3.1.1 oraz 3.1.2 zostały zrealizowane poprzez zaznaczenie w
// Preferences/save actions checkboxa Format source code/format all lines

// 3.1.3. - kombinacje klawiszy alt+strzałka w prawo/lewo pozwala na poruszanie
// się po ostatnio edytowanych plikach w kolejności edytowania (prawo - następny
// edytowany, lewo - poprzedni edytowany)

// Punkty 3.1.10 oraz 3.1.11 zrealizowane poprzez ustawienie w preferences/save
// actions /additional actions.
