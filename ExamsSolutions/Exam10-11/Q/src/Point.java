
public class Point {
    private int x,y;
	Point(int x,int y){
		this.x=x;
		this.y=y;
		
	}
	Point(){
		x=0;
		y=0;
	}
	int getX(){ return x;}
	int getY(){ return y;}
	Point makeMax(Point p){
		return new Point(Math.max(x, p.getX()),Math.max(y,p.getY()));
	}
	Point makeMin(Point p){
		return new Point(Math.min(x, p.getX()),Math.min(y,p.getY()));
	}
}
