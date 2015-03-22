
public class Position {
	private int pageNo,lineNo;
	public Position(){ pageNo=1; lineNo=1; }
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		 this.pageNo = pageNo;
	}
	public int getLineNo() {
		return lineNo;
	}
	public void setLineNo(int lineNo) {
		if(lineNo>=1&&lineNo<=25) this.lineNo = lineNo;
	}
    public void advance(int n){
    	if (n > 0) {
			if (n + lineNo <= 25) {
			    lineNo = lineNo + n;
			} else

			{
				pageNo++;
				int remaining = n - (25 - lineNo);
				lineNo = remaining % 25;
				if (lineNo == 0)
					lineNo = 25;
				pageNo = pageNo + remaining / 25;
				if (remaining % 25 == 0) // hacking the solution done right!
					pageNo--;
			}}
    }
    public String toString() { return "Page: "+pageNo+" Line: "+lineNo; }
    public static void main(String[] args) {
		Position p=new Position();
		p.setPageNo(2);
		p.setLineNo(12);
		System.out.println(p);
		p.advance(65);
		System.out.println(p);
	}
}
