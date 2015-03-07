package game;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import java.io.*;

//this is the menu.
public class Menu extends BasicGameState {

	Image playNow;
	Image exitGame;

	public Menu(int State) {

	}

	public void init(GameContainer gc, StateBasedGame sbg)
			throws SlickException {
		playNow = new Image("res/playNow.png");
		exitGame = new Image("res/exitGame.png");
	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {
		g.drawString("Are you ready?", 340, 50);
		playNow.draw(300, 200);
		g.drawString("Yes: Press Y", 340, 170);
		exitGame.draw(300, 300);
		g.drawString("Nope: Press N",340, 270);
		
		//g.drawString("Or use the mouse...", 320, 400);

	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {
		int xpos = Mouse.getX();
		int ypos = Mouse.getX();
		Input input = gc.getInput();
		//playNow Button
		if ((xpos > 310 && xpos < 370) && (ypos > 160 && ypos < 180)) {
			if (Mouse.isButtonDown(0)) {
				sbg.enterState(1);
			}
		}
		//extitGame button
		if ((xpos>100 && xpos<311) && (ypos>109 && ypos<160)){
			if(Mouse.isButtonDown(0)){
				System.exit(0);
			}
		}
		
		if (input.isKeyDown(Input.KEY_Y)) {
			sbg.enterState(1);
		}
		
		if (input.isKeyDown(Input.KEY_N)) {
			System.exit(0);
		}
	}

	public int getID() {
		return 0;
	}

}
