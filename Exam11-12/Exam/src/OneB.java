public class OneB {

    public static double meanColSums(int[][] matrix) {
        // ADD CODE HERE 
    	int nrcol=matrix[0].length;
    	int st=0;
    	for(int i=0;i<nrcol;i++){
    		int sc=0;
    		for(int j=0;j<matrix.length;j++)
    			sc+=matrix[j][i];
    		st+=sc;
    	}
    	return ((double)st)/nrcol;
    			
    } 
    public static void main(String[] args) {
		System.out.println(meanColSums(new int[][] {{1,0,0,0,0}}));
		System.out.println(meanColSums(new int[][] {{12, 1, 14}, {2, 5, 5}, {8, 1, 2}}));
	}
}
