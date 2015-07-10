package game;

import org.newdawn.slick.geom.Shape;

class Movable
{
  public float x;
  public float y;
  public float dx;
  public float dy;
  private Shape shape;

  public Movable(float x, float y, Shape s)
  {
    this.x = x;
    this.y = y;
    this.shape = s;
  }

  public Shape getShape() {
    this.shape.setX(this.x - this.shape.getWidth() / 2.0F);
    this.shape.setY(this.y - this.shape.getHeight() / 2.0F);
    return this.shape;
  }

  public float distance(Movable m) {
    return (float)Math.sqrt(Math.pow(m.x - this.x, 2.0D) + Math.pow(m.y - this.y, 2.0D));
  }
}
