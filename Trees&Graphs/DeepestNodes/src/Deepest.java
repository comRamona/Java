import java.util.LinkedList;

public class Deepest {
	Node root;
	int max = 0;

	private class Node {
		Node left, right;
		int value;

		public Node(int value) {
			this.value = value;
		}
	}

	private void put(int value) {
		root = put(root, value);
	}

	private Node put(Node x, int value) {
		if (x == null)
			return new Node(value);
		if (value < x.value)
			x.left = put(x.left, value);
		else if (value > x.value)
			x.right = put(x.right, value);
		else
			x.value = value;
		return x;
	}

	private int depth() {
		LinkedList<Node> list = new LinkedList<Node>(); // list of deepest nodes
		int max = depth(root, 1, list);
		System.out.println("Deepest nodes:");
		for (Node i : list)
			System.out.print(i.value+" ");
		System.out.println();
		return max;
	}

	private int depth(Node x, int lvl, LinkedList<Node> list) {
		if (x != null) {
			if (max <= lvl) {
				if (max < lvl)
					list.clear();
				max = lvl;
				list.add(x);
			}
			max = depth(x.left, lvl + 1, list);
			max = depth(x.right, lvl + 1, list);
		}
		return max;

	}
	public void print(){
		print(root,0);
	}
	public void print(Node x,int lvl){
		if(x!=null){
			print(x.right,lvl+1);
			for(int i=0;i<10*lvl;i++)
				System.out.print(" ");
			System.out.println(x.value);
			print(x.left,lvl+1);
		}
	}
    public Node min(Node x){
    if(x.left==null) return x;
    else return min(x.left);
    	
    }
    public Node max(Node x){
    	if(x.right==null) return x;
    	else return max(x.right);
    }
    public void min(){
    	System.out.println("min "+min(root).value);
    }
    public void max(){
    	System.out.println("max "+max(root).value);
    }
    public Node deleteMin(Node x){
    	if(x.left==null) return x.right;
    	x.left=deleteMin(x.left);
    	return x;
    }
    public Node deleteMax(Node x){
    	if(x.right==null) return x.left;
    	x.right=deleteMax(x.right);
    	return x;
    }
    public void deleteMin(){
    	deleteMin(root);
    }
    public void deleteMax(){
    	deleteMax(root);
    }
	public static void main(String[] args) {
		Deepest test = new Deepest();
		test.put(50);
		test.put(30);
		test.put(20);
		test.put(30);
		String s;
		test.put(40);
		test.put(70);
		test.put(60);
		test.put(80);
		test.print();
        test.min();
        test.max();
		System.out.println("max depth: "+test.depth());
		test.deleteMin();
		System.out.println("Deleting minimum: ");
		test.print();
		test.deleteMax();
		System.out.println("Deleting maximum: ");
		test.print();
		test.deleteMin();
		System.out.println("Deleting minimum: ");
		test.print();
	}
}
