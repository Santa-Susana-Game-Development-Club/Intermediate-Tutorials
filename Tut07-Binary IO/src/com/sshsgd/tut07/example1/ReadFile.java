package com.sshsgd.tut07.example1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
	
	public void readFile(String fileName) throws FileNotFoundException {
		File file = new File(fileName);
		Scanner in = new Scanner(file);
		while(in.hasNext()) {
			System.out.println(in.next());
		}
		in.close();
	}
	
}
