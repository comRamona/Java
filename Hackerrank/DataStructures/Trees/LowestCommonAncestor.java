 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node lca(Node root,int v1,int v2)
    {
      if(root==null) return root;
      int key=root.data;
      if(key<v1&&key<v2) return lca(root.right,v1,v2);
      if(key>v1&&key>v2) return lca(root.left,v1,v2);
      return root;
       
    }




