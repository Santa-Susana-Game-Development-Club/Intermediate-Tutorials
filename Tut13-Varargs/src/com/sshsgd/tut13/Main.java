package com.sshsgd.tut13;

import java.util.ArrayList;

/**
 * Sometimes when creating a method, you want to take a variable amount of arguments. For 
 * example, say you wanted to add a bunch of values to an array list in one line, some might
 * just take an array and you just put the values in the {}'s. There's another way of doing this
 * that some might think looks better, called varargs. (short for variable arguments)
 */

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>();
		
		intList.add(20);

		try {
			addAllToArrayList(intList);
		} catch (NotEnoughArgumentsExcpetion e) {
			e.printStackTrace();
		}
		
		try {
			addAllToArrayList(intList, 4, 6, 2, 5);
		} catch (Exception e) {}

		for(int i : intList) {
			System.out.println(i);
		}
		
	}

	@SafeVarargs
	private static <E> void addAllToArrayList(ArrayList<E> list, E... values) throws NotEnoughArgumentsExcpetion { //A varargs parameter is the type followed by three dots
		if(values.length < 1) { //The parameter behaves like an array
			throw new NotEnoughArgumentsExcpetion();
		} else {
			for(E e : values) {
				list.add(e);
			}
		}
	}
	
}
