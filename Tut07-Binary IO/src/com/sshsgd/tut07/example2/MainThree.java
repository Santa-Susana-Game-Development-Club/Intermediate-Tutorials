package com.sshsgd.tut07.example2;

import java.io.IOException;
import java.util.Random;

public class MainThree {

	public static final Save defaultSave = new Save(0);
	
	static String fileName = "Tutorial 7 File 2.dat"; 
	
	public static void main(String[] args) {
		Save s;
		Random r = new Random();
		int[] scores = new int[100];
		int highScore;
		
		try {
			s = new Save(Save.load(fileName));
		} catch (Exception e) {
			System.out.println("Could not load file, setting to default save.");
			s = new Save(defaultSave);
		}
		
		highScore = s.getHighScore();
		System.out.println(String.format("High Score: %s", sixLeadingZeros(highScore)));
		
		for(int i = 0; i < scores.length; i++) {
			scores[i] = r.nextInt(1000);
		}
		
		highScore = Math.max(highScore, highestInIntArray(scores));
		System.out.println(String.format("New High Score: %s", sixLeadingZeros(highScore)));
		
		s.setHighScore(highScore);
		try {
			Save.save(s, fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static String sixLeadingZeros(int i) {
		return String.format("%06d", i);
	}

	private static int highestInIntArray(int[] array) {
		int max = 0;
		
		for(int i : array) {
			max = Math.max(i, max);
		}
		
		return max;
	}
	
}
