
public class SinglyLinkedListR<T> {
	private class Node{
		private T info;
		private Node next;
		public Node(){
			this(null,null);
		}
		public Node(T info){
			this(info,null);
		}
		public Node(T info, Node next){
			this.info=info;
			this.next=next;
		}
		
		public void setNext(Node next){
			this.next=next;
		}
		public Node getNext(){
			return next; 
		}
	    public void setInfo(T info){
		this.info=info;
     	}
	    public T getInfo(){
		return info;
    	}
	    public String toString(){
	    	return info.toString();
	    }
	}
	private Node first,last;
	private int nr;
	public SinglyLinkedListR(){
		first=null;
		last=null;
		nr=0;
	}
	public int getSize(){
		return nr;
	}
	public void addEnd(T info){
		if((first==null&&last!=null)||(last==null&&first!=null))
			System.err.println("An error has occured");
		if(first==null&&last==null){
			nr=1;
			Node n=new Node(info);
			first=n;
			last=n;
		}
		else{
			Node c=new Node(info);
			last.setNext(c);
			last=c;
			nr++;
		}
			
		
	}
	public void addBeg(T info){
		if((first==null&&last!=null)||(last==null&&first!=null))
			System.err.println("An error has occured");
		if(first==null&&last==null){
			nr=1;
			Node n=new Node(info);
			first=n;
			last=n;
		}
		else{
			Node c=new Node(info);
			c.setNext(first);
			first=c;
			nr++;
		}
		
	}
	public void delFirst(){
		if(nr==0) return;
		if(nr==1) { first=null; last=null; nr=0; }
		else {
		Node c=first;
		first=c.getNext();
		nr--;
		}
		
	}
	public void delPos(int pos){
		if(pos>nr) return;
		if(pos<=0) return;
		if(pos==1) { delFirst();}
		if(pos==nr){
			Node c=first;
			Node t=first;
			while(t.getNext()!=null){
				c=t;
				t=c.getNext();
			}
			last=c;
			last.setNext(null);
		}
		else{ Node c=first; Node t=first; pos--;
		while(pos!=0){
			c=t;
		    t=c.getNext();
			pos--;
		}
		c.setNext(t.getNext());
		}
	}
	public void delAfter(Node q){
		if(q!=null&&q.getNext()!=null){
			Node r=q.getNext();
			q.setNext(r.getNext());
	}
	}
	public String toString(){
		String s="";
		Node c=first;
		while(c!=null){
			s+=c;
			if(c!=last) s+=" ==> ";
			c=c.getNext();
		}
		return s;
	}
	public static void main(String[] args) {
		SinglyLinkedListR<Integer> list1=new SinglyLinkedListR<Integer>();
		list1.addEnd(2);
		list1.addEnd(7);
		list1.addEnd(9);
		list1.addEnd(5);
		list1.addBeg(45);
		list1.delFirst();
		list1.addBeg(16);
		list1.addEnd(56);
		System.out.println(list1);
	}
}
