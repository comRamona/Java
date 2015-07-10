package suf;

import java.util.Stack;

public class Brackets {
	public int solution(String S) {
		int n=S.length();
		Stack<Character> st=new Stack<Character>();
		for(int i=0;i<n;i++){
			Character c=S.charAt(i);
			if(c.equals('(')||c.equals('[')) st.push(c);
			else if(c.equals(')')||c.equals(']')) {
				if(st.empty()||(c.equals(')')&&st.peek().equals('['))||(c.equals(']'))&&st.peek().equals('('))
						return 0;
						else
							st.pop();
			}
			
		}
		return st.empty() ? 1:0;
	}
}
