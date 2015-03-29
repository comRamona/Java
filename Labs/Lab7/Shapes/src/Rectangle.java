public class Rectangle{
	private Point2DDouble topLeft, bottomRight;
	public Rectangle(Point2DDouble topLeft, Point2DDouble bottomRight){
		this.topLeft=topLeft;
		this.bottomRight=bottomRight;
		
	}
	public Rectangle() {this(new Point2DDouble(0,0),new Point2DDouble(1, 1)); }
	
	public boolean isPointInside(Point2DDouble pt) {
		
		return pt.getX()>topLeft.getX()&&pt.getX()<bottomRight.getX()&&pt.getY()>topLeft.getY()&&pt.getY()<bottomRight.getY();
		
		
	}
	
	
	
	
}