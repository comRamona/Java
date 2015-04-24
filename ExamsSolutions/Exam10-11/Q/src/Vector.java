public class Vector {
	private int xdisp, ydisp;

	public Vector(int xdisp, int ydisp) {
		this.xdisp = xdisp;
		this.ydisp = ydisp;
	}

	public int getXdisp() {
		return xdisp;
	}

	public int getYidp() {
		return ydisp;
	}

	public Point translate(Point p){
		Point q=new Point(p.getX()+xdisp,p.getY()+ydisp);
		return q;
		
	}
	public double magnitude() {
		return Math.sqrt(xdisp * xdisp + ydisp * ydisp);
	}
	

}
