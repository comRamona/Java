
public class Polygon {
private Vector[] vectors={};
public Polygon(Vector[] vectors){
	this.vectors=vectors;
}
public Vector[] getVectors(){
	return vectors; }
public double perimeter(){
	double s=0;
	for(Vector v:vectors)
		s+=v.magnitude();
	return s;
}
boolean isClosed(){
	Point p=new Point(0,0);
	for(Vector v:vectors)
		p=v.translate(p);
	if(p.getX()==0&&p.getY()==0) return true;
	return false;
}
public double area(){
	if(!isClosed()) return 0.0;
	double a=0;
	Point p=new Point(0,0);
	Point q=new Point(0,0);
	for(Vector v:vectors){
	   q=v.translate(p);
	   a+=p.getX()*q.getY()-p.getY()*q.getX();
	   p=v.translate(p);
	}
	return Math.abs(a/2.0);
	}
public Point[] boundingBox(){
	Point[] limits=new Point[2];
	Point min=new Point(0,0);
	Point max=new Point(0,0);
	Point p=new Point(0,0);
	for(Vector v:vectors){
		p=v.translate(p);
		max=max.makeMax(p);
		min=min.makeMin(p);
	}
	limits[0]=min;
	limits[1]=max;
	return limits;
	}
}
