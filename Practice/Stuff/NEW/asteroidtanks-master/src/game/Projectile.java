package game;

import org.newdawn.slick.geom.Shape;

class Projectile extends Movable
{
  public boolean hostile;

  public Projectile(float x, float y, Shape s, boolean hostile)
  {
    super(x, y, s);
    this.hostile = hostile;
  }
}