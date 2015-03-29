
public class NoughtsAndCrosses {
	public static final int NONE=0;
	public static final int NOUGHTS=1;
	public static final int CROSSES=2;
	private int[][] board;
	private int whoWon=NONE;
	public NoughtsAndCrosses(int[][] board){ this.board=board; }
	public boolean isDraw() { return whoWonIs()==0; }
	public int whoWon(){ if(whoWonIs()==1) whoWon=NOUGHTS; if(whoWonIs()==2) whoWon=CROSSES; return whoWon; }
	private int whoWonIs() {
		int s1=0,s2=0,s3=0,s4=0;
		for(int i=0;i<3;i++)
			//lines
			for(int j=0;j<3;j++) s1+=board[i][j];
	     
		//columns
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++) s2+=board[j][i];

		for(int i=0;i<3;i++){
			s3+=board[i][i];
			s4+=board[i][2-i];}
		if(s1==3||s2==3||s3==3||s4==3) return 1;
		if(s1==6||s2==6||s3==6||s4==6) return 2;
		return 0;
	}
	public static void main(String[] args) {
		int[][] board = { { NONE, NONE, NOUGHTS },
                { NONE, NONE, NOUGHTS },
                { NONE, NONE, NOUGHTS }, };

NoughtsAndCrosses nc = new NoughtsAndCrosses(board);

System.out.println(nc.isDraw()); // false
System.out.println(nc.whoWon()); // NOUGHTS
	}

}
