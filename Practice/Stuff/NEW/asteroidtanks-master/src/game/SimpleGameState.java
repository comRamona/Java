package game;

import org.newdawn.slick.state.BasicGameState;

public abstract class SimpleGameState extends BasicGameState {
	int mouseX;
	int mouseY;
	int mouseOldX;
	int mouseOldY;
	int mouseLastEventX;
	int mouseLastEventY;
	boolean[] mouse = new boolean[8];
	boolean[] keys = new boolean[512];

	public void mousePressed(int button, int x, int y) {
		this.mouseX = x;
		this.mouseY = y;
		this.mouseLastEventX = x;
		this.mouseLastEventY = y;
		this.mouse[button] = true;
	}

	public void mouseReleased(int button, int x, int y) {
		this.mouseX = x;
		this.mouseY = y;
		this.mouseLastEventX = x;
		this.mouseLastEventY = y;
		this.mouse[button] = false;
	}

	public void mouseMoved(int oldx, int oldy, int newx, int newy) {
		this.mouseOldX = oldx;
		this.mouseOldY = oldy;
		this.mouseX = newx;
		this.mouseY = newy;
	}

	public void keyPressed(int key, char c) {
		this.keys[key] = true;
	}

	public void keyReleased(int key, char c) {
		this.keys[key] = false;
	}

	public abstract void reset();
}