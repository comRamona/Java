package game;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import java.io.*;

//this is the menu.
public class Gameover extends BasicGameState {

	public Gameover(int State) {

	}

	public void init(GameContainer gc, StateBasedGame sbg)
			throws SlickException {
	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {
		g.drawString("GAME OVER", 340, 50);
		g.drawString("Try Again?", 340, 100);
		g.drawString("Yes: Press Y", 340, 170);
		g.drawString("Nope: Press N",340, 270);
		
		//g.drawString("Or use the mouse...", 320, 400);

	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {
		Input input = gc.getInput();
		
		if (input.isKeyDown(Input.KEY_Y)) {
			System.exit(0);
			sbg.enterState(1);
		}
		
		if (input.isKeyDown(Input.KEY_N)) {
			System.exit(0);
		}
	}

	public int getID() {
		return 2;
	}

}

