import java.util.ArrayList;
import java.util.HashMap;


public class coins {

/*
Given a list of N coins, their values (V1, V2, … , VN), and the total sum S. Find the minimum number of coins the sum of which is S (we can use as many coins of one type as we want), or report that it’s not possible to select coins in such a way that they sum up to S.
 Dynamic programming:
 https://www.topcoder.com/community/data-science/data-science-tutorials/dynamic-programming-from-novice-to-advanced/
 */
	
public static void count(){
	try{int N=5;  //numbers of coins
	int[] v={1,2,5,7,50};  //coins to be used
	
	int s=12;  //sum to get
	int[] min=new int[s+1];
	for(int i=0;i<=s;i++)
		min[i]=Integer.MAX_VALUE;
	
	min[0]=0;
	
	ArrayList<Integer> values=new ArrayList<Integer>();
	HashMap<Integer,ArrayList<Integer>> alls=new HashMap<Integer,ArrayList<Integer>>();

	alls.put(0,values);
	int last=0;
	for(int i=1;i<=s;i++){
		for(int j=0;j<N;j++)
			if(v[j]<=i&&min[i-v[j]]+1<min[i]){
				//see to which previous sum we can add a coin to get best result for current sum 
				min[i]=min[i-v[j]]+1;
				last=j;
				
			}
		ArrayList<Integer> old=alls.get(i-v[last]);
		@SuppressWarnings("unchecked")
		ArrayList<Integer> copy=(ArrayList<Integer>) old.clone();   //get coins used for previous sum used to construct this one
		//need to use clone so we do not modify previous lists
		copy.add(v[last]);  //save coin that added to previous sum gets current sum
		alls.put(i,copy);  //store updated coin list
	}
			
	System.out.println("The minimum number to get "+s+" is "+min[s]);
	System.out.println(("And the coins used are:"+alls.get(s)));
	}
	catch(Exception e){
		System.out.println("Sum cannot be obtained");
	}
}
public static void main(String[] args) {
	count();
}	
}

