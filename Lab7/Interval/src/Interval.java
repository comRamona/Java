
public class Interval {
private double left,right;
public Interval(double left, double right)
{ this.left=left; this.right=right; }

public boolean doesContain(double x)
{return left<=x&&x<=right; }

public boolean isEmpty()
{return left>right; }

public boolean intersects(Interval b)
{ if(b.isEmpty()||isEmpty()) return false;
  else return ((left<=b.left&&right>=b.left)||(b.left<=left&&b.right>=left)); }

public String toString(){
	if(isEmpty()) return("Interval: (EMPTY)");
	else return("Interval: ["+left+", "+right+"]");
}

}
