
public class Circle {
private Point2DDouble centre;
private double radius;;
	
public Circle(Point2DDouble centre, double radius)
{this.centre=centre; this.radius=radius; }

public Circle() { this(new Point2DDouble(0,0),1);}

public boolean isPointInside(Point2DDouble pt)

{ return (Point2DDouble.distance(pt,centre)<radius); }
     
}
