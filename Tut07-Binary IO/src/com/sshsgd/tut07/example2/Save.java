package com.sshsgd.tut07.example2;

import java.io.*;

public class Save implements Serializable {

	private static final long serialVersionUID = 2100314544927651771L;
	
	private int highScore;

	public Save(int highScore) {
		this.highScore = highScore;
	}
	
	public Save(Save s) {
		this.highScore = s.getHighScore();
	}

	public int getHighScore() {
		return highScore;
	}

	public void setHighScore(int highScore) {
		this.highScore = highScore;
	}
	
	public static Save load(String fileName) throws IOException, ClassNotFoundException {
		Save s = null;
		ObjectInputStream in;
		FileInputStream fileIn;
		File file = new File(fileName);
		fileIn = new FileInputStream(file);
		in = new ObjectInputStream(fileIn);
		s = new Save((Save) in.readObject());
		fileIn.close();
		in.close();
		return s;
	}
	
	public static void save(Save s, String fileName) throws IOException {
		ObjectOutputStream out;
		FileOutputStream fileOut;
		File file = new File(fileName);
		fileOut = new FileOutputStream(file);
		out = new ObjectOutputStream(fileOut);
		out.writeObject(s);
		out.close();
		fileOut.close();
	}
	
}
