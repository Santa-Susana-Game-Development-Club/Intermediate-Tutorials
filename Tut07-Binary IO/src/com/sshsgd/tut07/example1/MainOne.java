package com.sshsgd.tut07.example1;

import java.io.IOException;

public class MainOne {

	static String fileName = "Tutorial 7 File 1.txt";
	
	public static void main(String[] args) {
		WriteFile write = new WriteFile();
		try {
			write.writeFile(fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
