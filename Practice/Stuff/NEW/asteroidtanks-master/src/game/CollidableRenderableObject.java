package game;

import java.util.ArrayList;
import org.lwjgl.util.vector.Vector;
import org.lwjgl.util.vector.Vector2f;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.*;

//import com.sun.xml.internal.rngom.parse.host.Base;

public class CollidableRenderableObject extends RenderableObject {
	public enum Physics {
		Circular, Rectangular
	}

	public boolean invert = false;
	public boolean resolve = true;
	public static ArrayList<CollidableRenderableObject> collRendObjects;
	static boolean init2 = true;

	public Vector2f GetPhysicsCenter() {
		return new Vector2f(physicsShape.getCenterX(),
				physicsShape.getCenterY());
	}

	static void Init2() {
		if (init2) {
			collRendObjects = new ArrayList<CollidableRenderableObject>();
			init2 = false;
		}
	}
	public void Destroy(){
		super.Destroy();
		collRendObjects.remove(this);
		
	}

	static int SizeColls() {
		if (collRendObjects == null)
			return 0;
		else
			return collRendObjects.size();
	}

	public static void CheckCollisions() {
		// System.out.print(SizeColls());
		for (int i = 0; i < SizeColls(); i++) {

			collRendObjects.get(i).physicsShape
					.setX(collRendObjects.get(i).rectangle.getX());
			collRendObjects.get(i).physicsShape
					.setY(collRendObjects.get(i).rectangle.getY());

		}
		for (int i = 0; i < SizeColls(); i++) {
			for (int j = i + 1; j < SizeColls(); j++) {
				boolean in = collRendObjects.get(i).CheckIntersection(
						collRendObjects.get(j));
				boolean inv = collRendObjects.get(i).invert
						|| collRendObjects.get(j).invert;
				if (inv ? !in : in) {
					// if(collRendObjects.get(i).resolve &&
					// collRendObjects.get(j).resolve){

					// }
					CollidableRenderableObject oi = collRendObjects.get(i), oj = collRendObjects.get(j);
					oi.Colleded(oj);
					oj.Colleded(oi);
				}
			}
		}
	}

	public Float speedExchange = null;

	public void Colleded(CollidableRenderableObject cro) {
		if (!resolve)
			return;

		angleSpeed = Play.RandMinus1To1() * 90f;
		Vector2f deltaPos;
		if (cro.invert) {
			deltaPos = Vector2f.sub(cro.GetPhysicsCenter(),
					this.GetPhysicsCenter(), null);
			deltaPos.normalise(deltaPos);
			deltaPos.scale(speed);
		} else {
			deltaPos = Vector2f.sub(this.GetPhysicsCenter(),
					cro.GetPhysicsCenter(), null);
			deltaPos.normalise(deltaPos);
			// this will make speeds the same gradually!
			if(cro.resolve){
			if (cro.speedExchange == null) {
				speedExchange = speed;
				deltaPos.scale(cro.speed);
			} else {
				deltaPos.scale(cro.speedExchange);
				cro.speedExchange = null;
			}
			}else{
				deltaPos.scale(speed);
			}
		}

		// System.out.print(speed+", ");
		SetVelocity(deltaPos);
		// = Vector2f.sub(left, right, dest) this.GetPosition().;
	}

	public Physics physics;
	public Shape physicsShape;

	public void SetPhysics(Physics newPhysics, float scale) {
		physics = newPhysics;
		switch (physics) {
		case Circular:
			physicsShape = new Circle(rectangle.getCenterX(), rectangle.getCenterY(),
					rectangle.getHeight() * scale/2f);
			break;
		case Rectangular:
			physicsShape = new Rectangle(rectangle.getX(), rectangle.getY(),
					rectangle.getWidth() * scale, rectangle.getHeight() * scale);
		}
	}

	public boolean CheckIntersection(CollidableRenderableObject other) {
		return physicsShape.intersects(other.physicsShape);
	}

	public CollidableRenderableObject(String file, Physics physics)
			throws SlickException {

		super(file);
		// Test1();
		Init2();
		SetPhysics(physics, 1f);
		collRendObjects.add(this);

	}

	public CollidableRenderableObject(String file, Physics physics, float scale)
			throws SlickException {

		this(file,physics,scale,1f);

	}
	
	public CollidableRenderableObject(String file, Physics physics, float scale,float physicsScale)
			throws SlickException {

		super(file, scale);
		// Test1();
		Init2();
		SetPhysics(physics, physicsScale);
		collRendObjects.add(this);

	}

	static int noi = 0;

	void Test1() {
		noi++;
		System.out.print(noi + " ");
	}
}
