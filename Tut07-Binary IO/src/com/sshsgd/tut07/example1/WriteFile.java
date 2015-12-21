package com.sshsgd.tut07.example1;

import java.io.*;
import java.util.Random;

public class WriteFile {

	private Random r;
	
	public WriteFile() {
		this.r = new Random();
	}
	
	public void writeFile(String fileName) throws IOException {
		File file = new File(fileName);
		PrintWriter out = new PrintWriter(file);
		for(int i = 0; i < 100; i++) {
			out.println(r.nextInt(100) + 1);
		}
		out.close();
	}

}
