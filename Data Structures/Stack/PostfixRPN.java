import java.util.Stack;


public class PostfixRPN {
	public int solution(String S) {
		Stack<Integer> stack=new Stack<Integer>();
		int n=S.length()-1;
		for(int i=0;i<=n;i++){
			Character c=S.charAt(i);
			if(c>='0'&&c<='9') {
				int nr=Character.getNumericValue(c);
			    stack.push(nr);
			}
			if(c.equals('+')){
				int a,b;
				if(stack.empty()) return -1;
				else a=stack.pop();
				if(stack.empty()) return -1;
				else b=stack.pop();
				if(b>4095-a) return -1;
				else{ int s=a+b;
					stack.push(s);
				}
			}
			if(c.equals('*')){
				int a,b;
				if(stack.empty()) return -1;
				else a=stack.peek();
				if(stack.empty()) return -1;
				else b=stack.peek();
				if(b>4095/a) return -1;
				else{ int p=a*b;
					stack.push(p);
					stack.pop();
				}
			}
					
			
		}
		if(stack.empty()) return -1;
		else
			return stack.pop();
	}
}
