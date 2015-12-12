package com.sshsgd.tut06.example2;

import java.util.Random;
import java.util.Scanner;

public class Game {

	boolean run;
	Scanner in;
	Random r;
	
	public Game() {
		this.run = true;
	}
	
	public void create() {
		System.out.println("I am called before the game loop!");
		in = new Scanner(System.in);
		r = new Random();
	}
	
	public void update() {
		int computer = r.nextInt(10) + 1;
		int player;
		System.out.println("Enter a number from 1 - 10! 0 to quit");
		player = in.nextInt();
		if(player == 0) {
			run = false;
		} else if(player >= 1 && player <= 10) {
			if(player == computer) {
				System.out.println("You guessed right!");
			} else {
				System.out.println("You guessed wrong! The answer was: " + computer);
			}
		}
	}
	
	public void dispose() {
		System.out.println("I am called after the game loop!");
		in.close();
	}
	
}
