public class AVLInsert{  
      class Node {
       Node() {
       }
       int val;   //Value
       int ht;      //Height
       Node left;   //Left child
       Node right;   //Right child
     }


   private static Node rotateRight(Node A) {
        Node B=A.left;
        A.left=B.right;
        B.right=A;
 
        //  Update heights
       updateHeight(A);
       updateHeight(B);
 
        // Return new root
        return B;
    }

    private static Node rotateLeft(Node A) {
       Node B=A.right;
        A.right=B.left;
        B.left=A;
 
        //  Update heights
       updateHeight(A);
       updateHeight(B);
 
        // Return new root
        return B;
    }
 
  private static int height(Node node){
       if(node==null) return -1;
       return node.ht;
   }

  private static int getBalanceFactor(Node node){
      if(node==null) return 0;
      return height(node.left)-height(node.right);
   }
   static Node insert(Node root,int val)
    {
       if (root == null) {
            final Node n = new Node();
            n.val = val;
            n.ht = 0;
            return n;
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        root = balance(root);
        return root;
       
    }

   private static Node balance(final Node root){
          
       final int balanceFactor = getBalanceFactor(root);
        if (balanceFactor == 2) {
            if (getBalanceFactor(root.left) == -1) {
                root.left = rotateLeft(root.left);
            }
            return rotateRight(root);
        }
        if (balanceFactor == -2) {
            if (getBalanceFactor(root.right) == 1) {
                root.right = rotateRight(root.right);
            }
            return rotateLeft(root);
        }
        updateHeight(root);
        return root;
    }
    private static void updateHeight(Node root){
        if (root != null){
            root.ht = 1+Math.max(height(root.left), height(root.right));
        }
    }
    
}