package com.sshsgd.tut06.example2;

public class GameThread extends Thread {

	Game g;

	public GameThread(Game g) {
		super();
		this.g = g;
		this.start();
	}
	
	@Override
	public void run() {
		g.create();
		while(g.run) {
			g.update();
		}
		g.dispose();
	}
	
}
