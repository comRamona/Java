
public class OneA {
	public boolean inRange(int[] a,int b,int c){
		for(int i:a)
			if(i<b||i>c) return false;
		return true;
	}

}
