import java.util.Scanner;
import java.util.Stack;

//example: ((1+(2*3))*(3+92))
public class InfixCalculator {
Stack<String> ops=new Stack<String>();
Stack<Double> vals=new Stack<Double>();
public Double eval(String s){
	int last=s.length();
	int i=0;
	String nr="";
	while(i!=last){
		String c=s.substring(i, i+1);
		if(c.equals("(")) ;
		else if(c.equals("+")||c.equals("*")||c.equals("/")||c.equals("-")) { ops.push(c); }
		else if(c.equals(")")){ 
			String op=ops.pop();
			if(op.equals("+")) vals.push(vals.pop()+vals.pop());
			if(op.equals("*")) vals.push(vals.pop()*vals.pop());
			if(op.equals("-")){
				Double b=vals.pop();
				Double a=vals.pop();
				vals.push(a-b);
			}
			if(op.equals("/")){
				Double b=vals.pop();
				Double a=vals.pop();
				vals.push(a/b);
			}
		}
		else {int j=i; nr="";
		while(c.compareTo("0")>=0&&c.compareTo("9")<=0){  nr+=c; j++; c=s.substring(j, j+1); //construct number
		} vals.push(Double.parseDouble(nr));
		i=j-1; }
	i++;	
	}
	return vals.pop();
}
public static void main(String[] args) {
	Scanner s=new Scanner((System.in));
	String eq=s.next();
	InfixCalculator c=new InfixCalculator();
	Double result=c.eval(eq);
	System.out.println("Result= "+result);
}
}
