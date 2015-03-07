package game;

import org.newdawn.slick.SlickException;

public class Bullet extends CollidableRenderableObject{

	public Bullet() throws SlickException {
		super("res/bullet.png",CollidableRenderableObject.Physics.Circular, 0.5f,0.9f);
		resolve = false;
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public void Colleded(CollidableRenderableObject cro) {
		if(cro instanceof Asteroid){
			cro.Explode();
			try {
				new Asteroid();
			} catch (SlickException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(!(cro instanceof Tank)){
			Destroy();
		}
		
	}

}
