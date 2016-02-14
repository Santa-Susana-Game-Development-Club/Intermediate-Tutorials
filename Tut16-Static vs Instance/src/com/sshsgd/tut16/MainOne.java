package com.sshsgd.tut16;

public class MainOne {

	public static void main(String[] args) {
//		System.out.println(Test.instanceInt);
		//^^Instance variables only exist in an object
		System.out.println(String.format("Default value: %d", Test.staticInt)); //Static variables take the default value of the type
		Test.staticInt = 2; // You can access a static variable before creating a new instance
		System.out.println(String.format("Value after setting: %d", Test.staticInt));
		Test.incrementStaticInt(); //Calling a static method
		System.out.println(String.format("Value after incrementing: %d", Test.staticInt));
		
//		Test.incrementInts();
		//^^Non static methods can only be called from objects
		Test test1 = new Test(5);
		Test test2 = new Test(2);
		
		System.out.println(String.format("Initial test1 Instance Int: %d", test1.instanceInt));
		System.out.println(String.format("Initial test2 Instance Int: %d", test2.instanceInt)); //The values of the instanceInt is different
		
		System.out.println(String.format("test1 Static Int: %d", test1.staticInt)); //Accessing a static variable from an object is discouraged
		System.out.println(String.format("test2 Static Int: %d", test2.staticInt)); //The values of the staticInt are the same
		System.out.println(String.format("Test Static Int: %d", Test.staticInt)); //Always call a static variable in a static way
		
		test1.incrementInts();
		System.out.println(String.format("test1 Instance Int after Incrementing test1: %d", test1.instanceInt)); //The instance variable changed in test1
		System.out.println(String.format("test2 Instance Int after Incrementing test1: %d", test2.instanceInt)); //The instance variable stayed the same in test2

		System.out.println(String.format("test1 Static Int after Incrementing test1: %d", test1.staticInt));
		System.out.println(String.format("test2 Static Int after Incrementing test1: %d", test2.staticInt));
		System.out.println(String.format("Test Static Int after Incrementing test1: %d", Test.staticInt)); //Static Int was changed in all instances of Test 
		
		/**
		 * 
		 * EXPECTED OUTPUT:
		 * 
		 * Default value: 0
		 * Value after setting: 2
		 * Value after incrementing: 3
		 * Initial test1 Instance Int: 5
		 * Initial test2 Instance Int: 2
		 * test1 Static Int: 3
		 * test2 Static Int: 3
		 * Test Static Int: 3
		 * test1 Instance Int after Incrementing test1: 6
		 * test2 Instance Int after Incrementing test1: 2
		 * test1 Static Int after Incrementing test1: 4
		 * test2 Static Int after Incrementing test1: 4
		 * Test Static Int after Incrementing test1: 4
		 * 
		 */
	}

}
