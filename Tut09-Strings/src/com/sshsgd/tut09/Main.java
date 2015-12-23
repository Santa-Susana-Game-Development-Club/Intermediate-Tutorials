package com.sshsgd.tut09;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("COMPARING STRINGS\n");
		
		String name1 = "Jose";
		String name2 = "Jose";
		String name3 = new String("Jose");
		
		//using the == operator is bad because you can get unexpected results
		
		System.out.println(name1 == name2); //True because both name1 and name2 point to the same string in memory
		System.out.println(name1 == name3); //False because calling "new" created a new string in memory
		
		String userName = "GameDevClub";
		String inputtedName = "gamedevclub";
		
		//When comparing strings, use the .equals() method
		
		System.out.println(inputtedName.equals(userName)); //False because the .equals() is case sensitive
		System.out.println(inputtedName.equalsIgnoreCase(userName)); //True because .equalsIgnoreCase() is not case sensitive

		System.out.println("\nCHAR TYPE\n");
		
		//Strings are arrays of the char type
		char a = 'a'; //chars have single quotes and only hold one character
		int aInt = (int) a; //Characters are represented by a number, and casting an int can give us that number
		char a1 = 97; //Number that represent the character can be the given value of the char
		System.out.println(a);
		System.out.println(aInt);
		System.out.println(a1);

		System.out.println("\nSTRING LENGTHS\n");
		String s1 = "Hello!";
		System.out.println(s1.length()); //Will return the length of the char[], which includes spaces and punctuation

		System.out.println("\nSUB STRINGS\n");
		String s2 = "I am a cool guy";
		String sub_s2 = s2.substring(5); //Makes a string starting at the 5th character(remember the first one is 0, so it would actually be the 6th letter)
		String sub2_s2 = s2.substring(7, 11); //Lets you take a portion of the string out
		System.out.println(sub_s2);
		System.out.println(sub2_s2);

		System.out.println("\nTRIM\n");
		String s6 = " Hello world ";
		System.out.println(s6);
		System.out.println(s6.trim()); //Removes trailing and leading spaces, but keeps spaces within the strings
		
		System.out.println("\nINDEX OF\n");
		String s3 = "Hello, I am Jose";
		System.out.println(s3.indexOf(',')); //Returns the first index of the char reading left to right
		System.out.println(s3.indexOf(' '));
		System.out.println(s3.lastIndexOf(' ')); //Returns the first index of the char reading right to left
		System.out.println(s3.indexOf('f')); //Returns -1 if the char is not in the string
		System.out.println(s3.indexOf("Jose")); //Returns index of first char where the string was found right to left
		System.out.println(firstWord(s3));
		System.out.println(lastWord(s3));

		System.out.println("\nREPLACE\n");
		String s4 = "Strings are cool";
		System.out.println(s4.replace(' ', '_')); //Replaces all the occurrences of first char with the second
		System.out.println(s4.replace("cool", "uncool")); //Replaces all occurrences of the first string with the second
		
		System.out.println("\nCHAR AT\n");
		String s5 = "Ayy lmao";
		System.out.println(s5.charAt(2)); //charAt() returns the char at the given index
		System.out.println(s5.charAt(s5.length() - 1)); //Returns the last character of the string
		System.out.println(s5.charAt(0)); //Returns the first character of the string
		
	}

	private static String firstWord(String s) {
		String trimmed = s.trim();
		int index = trimmed.indexOf(' ');
		String firstWord;
		if(index == -1) {
			firstWord = trimmed;
		} else {
			firstWord = trimmed.substring(0, index);
		}
		return firstWord;
	}
	
	private static String lastWord(String s) {
		String trimmed = s.trim();
		int index = trimmed.lastIndexOf(' ');
		String firstWord;
		if(index == -1) {
			firstWord = trimmed;
		} else {
			firstWord = trimmed.substring(index + 1); //Adding one to exclude the space itself
		}
		return firstWord;
	}
	
}
