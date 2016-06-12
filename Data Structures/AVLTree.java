// Java program for insertion in AVL Tree
 
class NodeTree {
 
    int key, height;
    NodeTree left, right;
 
    NodeTree(int d) {
        key = d;
        height = 1;
    }
}
 
public class AVLTree {
 
    static NodeTree root;
     
    // A utility function to get height of the tree
    int height(NodeTree N) {
        if (N == null) {
            return 0;
        }
        return N.height;
    }
 
    // A utility function to get maximum of two integers
    int max(int a, int b) {
        return (a > b) ? a : b;
    }
 
    // A utility function to right rotate subtree rooted with y
    // See the diagram given above.
    NodeTree leftLeftRotate(NodeTree y) {
        NodeTree x = y.left;
        NodeTree T2 = x.right;
 
        // Perform rotation
        x.right = y;
        y.left = T2;
 
        // Update heights
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;
 
        // Return new root
        return x;
    }
 
    // A utility function to left rotate subtree rooted with x
    // See the diagram given above.
    NodeTree rightRightRotate(NodeTree x) {
        NodeTree y = x.right;
        NodeTree T2 = y.left;
 
        // Perform rotation
        y.left = x;
        x.right = T2;
 
        //  Update heights
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;
 
        // Return new root
        return y;
    }
 
    // Get Balance factor of node N
    int getBalance(NodeTree N) {
        if (N == null) {
            return 0;
        }
        return height(N.left) - height(N.right);
    }
 
    NodeTree insert(NodeTree node, int key) {
         
        /* 1.  Perform the normal BST rotation */
        if (node == null) {
            return (new NodeTree(key));
        }
 
        if (key < node.key) {
            node.left = insert(node.left, key);
        } else {
            node.right = insert(node.right, key);
        }
 
        /* 2. Update height of this ancestor node */
        node.height = max(height(node.left), height(node.right)) + 1;
 
        /* 3. Get the balance factor of this ancestor node to check whether
         this node became unbalanced */
        int balance = getBalance(node);
 
        // If this node becomes unbalanced, then there are 4 cases
        // Left Left Case
        if (balance > 1 && key < node.left.key) {
            return leftLeftRotate(node);
        }
 
        // Right Right Case
        if (balance < -1 && key > node.right.key) {
            return rightRightRotate(node);
        }
 
        // Left Right Case
        if (balance > 1 && key > node.left.key) {
            node.left = rightRightRotate(node.left);
            return leftLeftRotate(node);
        }
 
        // Right Left Case
        if (balance < -1 && key < node.right.key) {
            node.right = leftLeftRotate(node.right);
            return rightRightRotate(node);
        }
 
        /* return the (unchanged) node pointer */
        return node;
    }
    
    NodeTree minValueNode(NodeTree x){
    	NodeTree current=x;
    	while(current.left!=null){
    		current=current.left;
    	}
    	return current;
    }
    
    NodeTree deleteNode(NodeTree root,int key){
    //First, perform standars BST deletion
    	if(root==null) return root;
    	if(key<root.key){
    		root.left=deleteNode(root.left,key);
    	}
    	else if(key>root.key){
    		root.right=deleteNode(root.right,key);
    
    	}
    	else
    		//we have reached node to delete
    	{
    		//node with one child or no child
    		if(root.left==null || root.right==null){
    			NodeTree temp=null;
    			if(temp==root.left){
    				temp=root.right;
    			}else{
    				temp=root.left;
    			}
    			//no child case
    			if(temp==null){
    				temp=root;
    				root=null;
    			}
    			else
    				//one child case
    			{
    				root=temp;
    			}
    			}
    		else {
    			//node with two children
    			//get the inorder successor (smallest in the right subtree)
    			NodeTree temp=minValueNode(root.right);
    			root.key=temp.key;
    			root.right=deleteNode(root.right,temp.key);
    		}
    		}
    	if(root==null)
    		return null;
    	
    	//time to balance
    	// STEP 2: UPDATE HEIGHT OF THE CURRENT NODE
        root.height = max(height(root.left), height(root.right)) + 1;
 
        // STEP 3: GET THE BALANCE FACTOR OF THIS NODE (to check whether
        //  this node became unbalanced)
        int balance = getBalance(root);
 
        // If this node becomes unbalanced, then there are 4 cases
        // Left Left Case
        if (balance > 1 && getBalance(root.left) >= 0) {
            return leftLeftRotate(root);
        }
 
        // Left Right Case
        if (balance > 1 && getBalance(root.left) < 0) {
            root.left = rightRightRotate(root.left);
            return leftLeftRotate(root);
        }
 
        // Right Right Case
        if (balance < -1 && getBalance(root.right) <= 0) {
            return rightRightRotate(root);
        }
 
        // Right Left Case
        if (balance < -1 && getBalance(root.right) > 0) {
            root.right = leftLeftRotate(root.right);
            return rightRightRotate(root);
        }
 
        return root;
    	}
    
 
    // A utility function to print preorder traversal of the tree.
    // The function also prints height of every node
    void preOrder(NodeTree node) {
        if (node != null) {
            System.out.print(node.key + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
 
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
 
        /* Constructing tree given in the above figure */
        root = tree.insert(root, 9);
        root = tree.insert(root, 5);
        root = tree.insert(root, 10);
        root = tree.insert(root, 0);
        root = tree.insert(root, 6);
        root = tree.insert(root, 11);
        root = tree.insert(root, -1);
        root = tree.insert(root, 1);
        root = tree.insert(root, 2);
 
        /* The constructed AVL Tree would be
           9
          /  \
         1    10
        /  \    \ 
       0    5    11 
      /    /  \
    -1   2    6
         */
        System.out.println("The preorder traversal of constructed tree is : ");
        tree.preOrder(root);
 
        root = tree.deleteNode(root, 10);
 
        /* The AVL Tree after deletion of 10
           1
          /  \
         0    9
        /     / \  
       -1    5   11  
      /  \
     2    6
         */
        System.out.println("");
        System.out.println("Preorder traversal after deletion of 10 :");
        tree.preOrder(root);
    }
}
