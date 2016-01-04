package com.sshsgd.tut15;

import java.util.Stack;

/**
 * The stack is probably the most important data structure in all computer science. Think of a 
 * stack like a stack of lunch trays. The last tray that gets placed, is the first one to be 
 * used and taken off of the stack. When an object is placed onto a stack, the using the stack
 * would result in the last thing being used, then taken out of the stack completely. The second
 * example will be where I show you why the stack is very important, but for this one, I will
 * show the list type Stack.
 */

public class MainOne {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		stack.push(42); //This is how you add something to the stack
		stack.push(54);
		System.out.println(stack);
		
		System.out.println(stack.pop()); //Pop is how you get something from the stack
		System.out.println(stack); //The stack is now smaller because we used the pop method

	}

}
