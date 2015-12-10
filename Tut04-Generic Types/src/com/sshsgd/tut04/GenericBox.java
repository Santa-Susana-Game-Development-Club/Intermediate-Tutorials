package com.sshsgd.tut04;

/**
 * A generic type is a generic class or interface that is parameterized over types.
 * - https://docs.oracle.com/javase/tutorial/java/generics/types.html
 *
 */
/**
 * 
 * Name Conventions for generic types:
 * E - Element (used extensively by the Java Collections Framework)
 * K - Key
 * N - Number
 * T - Type
 * V - Value
 * S,U,V etc. - 2nd, 3rd, 4th types
 * 
 */
public class GenericBox<T> {

	private T t;
	
	public void set(T v) {
		this.t = v;
	} 
	
	public T get() {
		return t;
	}
	
	public void print() {
		System.out.println(t.toString());
	}
	
}
