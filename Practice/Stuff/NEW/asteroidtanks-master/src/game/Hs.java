package game;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

//Testing this as a different sate
public class Hs extends BasicGameState {

	public Hs(int State) {

	}

	public void init(GameContainer gc, StateBasedGame sbg)
			throws SlickException {

	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {
		g.drawString("This is the Play State", 100, 100);

	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {

	}
	
	public int getID(){
		return 1;
	}

}
