package com.sshsgd.tut07.example1;

import java.io.FileNotFoundException;

public class MainTwo {

	static String fileName = "Tutorial 7 File 1.txt";
	
	public static void main(String[] args) {
		ReadFile readFile = new ReadFile();
		try {
			readFile.readFile(fileName);
		} catch (FileNotFoundException e) {
			System.out.println(String.format("The file, \"%s\" was not found", fileName));
		}
	}

}
