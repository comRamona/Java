package game;

import org.newdawn.slick.Color;
import org.newdawn.slick.gui.AbstractComponent;
import org.newdawn.slick.gui.ComponentListener;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;

public class ChangeGameStateListener implements ComponentListener {
        private StateBasedGame game;
        private int stateId;

        public ChangeGameStateListener(StateBasedGame game, int stateId) {
                this.game = game;
                this.stateId = stateId;
        }

        
        public void componentActivated(AbstractComponent arg0) {
                game.enterState(stateId, new FadeOutTransition(Color.black),
                                new FadeInTransition(Color.black));
        }
}